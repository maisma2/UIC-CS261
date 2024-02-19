#include <stdio.h>
//nothing to change here
int expensiveOperation(int input) {
    int result = 0;
    for (int k = 0; k < input; ++k) {
        result += (input ^ k) % 10; 
    }
    return result;
}

int main() {
    int N = 10000;
    long long int sum = 0;
    int invariantValue = expensiveOperation(N); // Invariant but expensive
    //Edit the below for loop only. 
    for (int i = 1; i <= N; ++i) { 
        sum += i * invariantValue;
    }
    printf("Sum is: %lld\n", sum);
    return 0;
}
