#include <stdio.h>

int main() {
    int N = 10000;
    int sum = 0;
    for (int i = 1; i <= N; ++i) {
        sum += i;    
    }
    printf("Sum is: %d\n", sum);
    return 0;
}
