#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
void greeting()
{
    printf("Hello World");
}
char* greeting1(char name[])
{
    printf("Hello World from greeting 1");
    printf("%s",name);
    return "Greeting from Greeting1 function";
}
int main()
{
    greeting();
    char* data=greeting1("Anu Sunny");
    printf("%s", data);
    return 0;
}