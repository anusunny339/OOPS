#include <stdio.h>
#include <stdlib.h>
int main()
{
    int intDataType = 4; // %d, %i  2 bytes
    printf("He is Integer Value %d", intDataType);
    float floatDataType = 3.14566; //%f  4 bytes
    printf("%.4f", floatDataType);
    double doubleDataType = 4.5445454; // %lf 8 bytes
    printf("Double value %lf", doubleDataType);
    char characterDataType = 'A'; // %c  1 byte
    printf("My grade is %c", characterDataType);
    char myName[] = "Dr Tarkeshwar Barua";
    printf("%lu\n", sizeof(intDataType));
    printf("%lu\n", sizeof(floatDataType));
    printf("%lu\n", sizeof(doubleDataType));
    printf("%lu\n", sizeof(characterDataType));
    printf("%lu\n", sizeof(myName));
       return (0);
}
