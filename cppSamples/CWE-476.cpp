//CWE-476: Null Pointer dereference (14)

#include <iostream>
#include <cstring>
using namespace std;

int main(int argc, char ** argv){
  char buf[255];
  char * ptr = NULL;
  if (argc>1) {
    ptr = argv[1];
  }
  strcpy(buf,ptr);
  return 0;
}

//Output: Segmentation fault(core dumped)
