//CWE-190: Integer Overflow (8) (X)


#include <iostream>
using namespace std;

#define INT_MAX 2147483647
int main(int argc, char** argv)
{
	char buffer[20];
//	fgets(buffer, 20, stdin);

	int num = 2150000000;
	// BAD: may overflow if input is very large
	int scaled = num + 1000;  //Non-compliant
	cout << "Integer overflow: ";
	cout << scaled;

	int num2 = 2140000000;
	int scaled2;
	// GOOD: use a guard to prevent overflow
	if (num2 < INT_MAX - 1000)
		scaled2 = num2 + 1000;
	else
		scaled2 = INT_MAX;
}

//Output: `Integer overflow: -2144966296
