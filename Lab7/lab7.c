#include <stdio.h>
int globalInt = 43;
unsigned long getSP() {
    unsigned long sp;
    __asm__("mov %%rsp, %0" : "=r"(sp));
    return sp;
}
int main(){
    short numArray[8];
    int i;
    char c;
    printf("Current Stack Pointer: %lx\n", getSP());
    printf("Please enter 8 numbers:");

int *heapInt = (int *) malloc(sizeof(int));
*heapInt = 42;
    for(i=0; i<8; i++){
        scanf("%hd", &(numArray[i]));
    }

    scanf("%c", &c);
    printf("Press any key to continue:");
    scanf("%c", &c);

    int value;
    printf("Please enter a number:");
    scanf("%d", &value);

    numArray[5] = -1;

    if(value > 10) {
        i++;
    } else {
        i--;
    }


    for(i=0; i<3; i++){
        numArray[i]++;
    }

    return 0;
}
