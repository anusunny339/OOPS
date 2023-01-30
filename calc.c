#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
double subtraction(double, double);
double sqrtoot(double);
float addition(float num1, float num2)
{
    return num1 + num2;
}
int main()
{
    printf("%f\n", addition(4, 6));
    printf("%lf", subtraction(5, 3));
    return 0;
}
double subtraction(double num1, double num2)
{
    return num1 + num2;
}
double sqroot(double num1){
    return sqrt(num1);
}
