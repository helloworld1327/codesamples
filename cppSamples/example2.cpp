//Constructors and destructors without move constructor

#include <iostream>

using namespace std;

class X {
    private:
        int num;
    public:
        //Default constructor
        X() : num(0) {
            cout << "Default Constructor" << endl;
        }

        //Overloaded constructor
        X(const int& val) : num(val) {
            cout << "Overloaded Constructor: Setting num to " << val << endl;
        }

        //Copy constructor
        X(const X& lVal) {
            this->num = lVal.num;
            cout << "Copy Constructor" << endl;
        }

        //Copy assignment constructor
        X& operator=(const X& lVal) {
            this->num = lVal.num;
            cout << "Copy Assignment Operator"<<endl;
            return *this;
        }

        //Destructor
        ~X() {
            cout << "Destructor"<<endl;
        }
};

X doSomething() {
    X x(100);

    return x;
}

X doSomething() {
    X x(100);

    return x;
}

X deadCode() {
	i = 1;
	//Dead code
	if(i !=1) {
		return false;
	}
	
}
int main() {
    cout << "x1:"<<endl;
    X x1 = doSomething();

    cout << "x2:"<<endl;
    X x2;
    x2  = doSomething();
}