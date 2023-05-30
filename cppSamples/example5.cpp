// Rule of 5 and Move constructor example
// We will use char* here on purpose (instead of say string)

// Also, this example DRYs the code as much as possible. Can you spot where?

#include <iostream>

using namespace std;

class X {
    private:
        int test;
        char* str;
    public:
        //Default constructor
        X() : str(NULL) { cout << "Default Constructor" << endl; }

        //Copy constructor
        X(const X& lVal) : X(lVal.str) { cout << "Copy Constructor" <<endl; }

        //This is the copy assignment operator
        X& operator=(const X& lVal) { cout << "Copy assignment operator" << endl; return *this = lVal.str; }

        //Destructor
        ~X() { cout << "Destructor" << endl; if (str) delete[] str; }

        //Move constructor
        X(X&& rVal) {
                cout << "Move constructor" << endl;
                this->str = rVal.str; //Shallow copy
                rVal.str = NULL; //Important - set to null otherwise rVal destructor will destroy heap
        }

        //----- Rule Of "5" Ends Here -----//

        //Overloaded constructor
        X(const char* lVal) : X() {
                cout << "Overloaded constructor: X(const char* lVal)" << endl;
                *this = lVal;
        }

        //Assignment operator (Note: This is not the copy assignment operator)
        X& operator=(const char* str) {
                cout << "Assignment operator overloaded operator=(const char* str) " << str << endl;

                if (this->str) delete [] this->str;
                this->str = new char(strlen(str));
                for(int i=0; str[i]; this->str[i] = str[i], i++); //Deepcopy - done explicitly here as an example to contrast from shallow copy in move constructor

                return *this;
        }

        const char* getStr() const { return this->str; }
};

X retByVal() {
        return X("Hello World");
}

int main() {
        X x4(retByVal());
        return 0;
}