#include<stdio.h>
#include<stdlib.h>
int main()
{
	srand(9603); //TODO: replace the question marks with the last 4 digits of your UIN
	
	int a = 123;
	int *ptr, **dpt;
	
	ptr = &a;
	dpt = &ptr;
	
	
	printf("The value of a is %d\n", a ); //TODO: print the value of a using variable 'a' (simple printf)
	
	printf("The value of a is %d\n", *ptr ); //TODO: print the value of a using variable ptr
	
	**dpt = rand(); //TODO: change the value of 'a' to rand() using variable dpt
	
	printf("The value of a is %d\n", **dpt ); //TODO: print the value of a using variable dpt


	return 0;
}
