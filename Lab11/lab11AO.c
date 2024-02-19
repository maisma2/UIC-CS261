#include <stdio.h>

int main() {
    int N = 10000;
    int sumOfNaturals = (N * (N + 1)) / 2; 
// Sum of first N natural numbers.
    int sum = sumOfNaturals * sumOfNaturals; 
// Square of the sum of first N natural numbers.
    printf("Sum is: %d\n", sum);
    return 0;
}
