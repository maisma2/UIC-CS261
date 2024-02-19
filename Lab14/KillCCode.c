#include <stdio.h>  
#include <time.h>

void func(float delayInSeconds) {
    time_t startTime;
    time_t now;
    float elapsedTime;
    float setTime = delayInSeconds;

    time(&startTime);
    while (elapsedTime < setTime) {

        now = time(NULL);
        elapsedTime = difftime(now, startTime);
    }
}

#include <stdio.h>
 
/* function declaration */
int num1=1000;
int main () {
 
   /* calling a function to get max value */
   func(num1);
 
   return 0;
}
