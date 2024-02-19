#include <stdio.h>

int main() {
   int num;
   printf("Enter the value for num: ");
   scanf("%d",&num);
   
   int prev = num-1;
   int result = num & prev;

   return 0;
}
