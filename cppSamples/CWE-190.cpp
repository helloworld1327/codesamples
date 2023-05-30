#include <iostream>

using namespace std;

//Integer Overflow

int main(int argc, char** argv) {
    int INT_MAX = 1500;
    char buffer[20];
    fgets(buffer, 20, stdin);
 
    int num = atoi(buffer);
    // BAD: may overflow if input is very large
    int scaled = num + 1000;
 
    // ...
 
    int num2 = atoi(buffer);
    int scaled2;
    // GOOD: use a guard to prevent overflow
    if (num2 < INT_MAX-1000) {
        scaled2 = num2 + 1000;
        printf("proceed...");
    }
    else {
        scaled2 = INT_MAX;
        printf("try a smaller number");
    }
}