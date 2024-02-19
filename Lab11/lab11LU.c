#include <stdio.h>
#include <stdlib.h>

#define SIZE 100000000

int main() {
    int *array = malloc(SIZE * sizeof(int));
    if (array == NULL) return 1;

    // Initialize the array with some values
//
    for (int i = 0; i < SIZE; ++i) {
        array[i] = i;
    }
// unroll the below loop
    long long sum = 0;
    int i = 0;
     for (; i <= SIZE - 8; i += 8) {
        sum += array[i] + array[i+1] + array[i+2] + array[i+3] +
               array[i+4] + array[i+5] + array[i+6] + array[i+7];
    }
    for (; i < SIZE; ++i) {
        sum += array[i];
    }


    printf("Sum: %lld\n", sum);

    free(array);
    return 0;
}
