#include <stdio.h>
#include<time.h>

int main() 
{
   float f;
   double d;
   d = time(NULL) / 32768.0;
   f = -123.4567;
   // add a breakpoint here
   printf("exiting program");
}
