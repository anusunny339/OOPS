#include <stdlib.h>
#include<string.h>
int main()
{
    char myName[]="Dr Tarkeshwar Barua";
    printf("My name is %s and string lenght is ", myName);
   printf("%ld \n", strlen(myName)); // total number of characters used in string
   printf("%ld", sizeof(myName));  // aquired bytes by variable
   char str1[]="HEllo";
   char str2[]="Hello";
   printf("str1 and str2, both are equal  %d",strcmp(str1,str2));
   char copyName[19];
   strcpy(copyName, myName);
   printf("\n%s",copyName);
   strcat(str1,myName);
   printf("\n Two string concatenate %s", str1);
    return 0;