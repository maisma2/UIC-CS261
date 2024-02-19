#include <stdio.h>

// Function that we may consider for inlining
int add(int a, int b) {
    return a + b;
}

int main() {
    int result = 0;

    // Repeatedly call 'add' in a loop
    for (int i = 0; i < 100000000; ++i) {
        result += add(i, i);
    }

    printf("Result: %d\n", result);
    return 0;
}
