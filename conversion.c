#include <stdio.h>
#include <stdlib.h>
int main()
{
    int x = 5;
    int y=2;
    float result = x/y; // implicit data type conversion 
    float result1=(float)x/y;
    printf("implicit %f", result);
    printf("explicit %lf", result1);
    return (0);
}
