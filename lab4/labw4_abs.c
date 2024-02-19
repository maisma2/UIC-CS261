#include <stdio.h>

int main() {

    int num; // Declare an integer variable to store the input number
    int absolute; // Variable to store absolute value
    
    /*Prompt the user to enter a number and store it in the 'num' 
    variable*/

    printf("Enter an integer: ");
    scanf("%d", &num);

    /* Right shifts by 31 places so that the sign bit is 
    transferred from Most Significant Bit -> Least Significant Bit*/

    int shifted_num = (num >> 31);

    /* TODO: (4.1) Fill in the blank with the appropriate bit-wise
       operator that extracts the sign bit from shifted_num.
       signBit should be equal to one if the number is negative 
       and equal to zero if the number is positive.
       Hint: you can debug the first lines of code of this program 
       to see what is the binary value in shifted_num when num is 
       positive or negative
    */ 
	

    int signBit = shifted_num & 1;

    /* Compute the absolute value using bitwise operations */
    if (signBit == 1) {

        /* TODO: (4.2) Fill in the blank to compute the absolute 
        value of the num if negative.
        You MUST flip the bits using a bitwise operator and then
        add 1.*/
	absolute = (~num) + 1; // ~ is a NOT operator to flip them and then add the 1
        
    } else {

       /* TODO: (4.3) Fill in the blank to compute the absolute
       value of num if positive */
	absolute = num;
    }

	printf("The absolute value is: %d\n", absolute); 
    
    return 0;
}
