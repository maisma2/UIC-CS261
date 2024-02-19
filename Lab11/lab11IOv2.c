#include <stdio.h>

int main() {
    int result = 0;

    // Manually inline 'add' by adding directly
    for (int i = 0; i < 100000000; ++i) {
        result += i + i; 
    }

    printf("Result: %d\n", result);
    return 0;
}
