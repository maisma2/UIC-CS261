#include<stdio.h>

int main()
{
  long long unsigned int i = 0;
  long long unsigned int j = 1;
  long long unsigned int num = 0;
  //set breakpoint here
  printf ("Enter the number: ");
  scanf ("%llu", &num );

  for (i=1; i<=num; i++) 
      j=j*i;    //It was not calculating up to num before, and 0 * 0 would always stay 0
 
  printf("The factorial of %llu is %llu\n",num,j); 

  return 0;
}
