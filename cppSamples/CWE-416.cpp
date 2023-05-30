//CWE-416: Use after free (7)

#include <iostream>
#include <cstdlib>
#include <cstring>

using namespace std;

#define SIZE 14
int main(int argc, char** argv)
{
	//Potential use after free
	char* buf = new char[SIZE];
	strcpy(buf,"Hello World!!!");
	bool error = true; //assume  error
	if (error) {
		free(buf); //error handling has freed the buffer
	}

	//log_contents(buf); //but it is still used here for logging
	cout << buf;  //non-compliant
	cout << buf[0];
}


//output: no output

