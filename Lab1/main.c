#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main()
{
	srand(time(0));
	
	int a=rand();
	int *ptr, **pptr;
	
	ptr = &a;
	pptr = &ptr;
	
	printf("This is lab1.\n");
	printf("%d\n",(int)time(NULL));
	printf("%p\n", (void *)&a);
	printf("%p\n", (void *)ptr);
	printf("%d\n", *ptr);
	printf("%d\n", **pptr);

	return 0;
}
