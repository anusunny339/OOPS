#include<stdio.h>
#include<string.h>
struct testStruct{
    int salary;
    char name[100];
    char grade;
};
int main(){
    printf("Struct Demo");
    struct testStruct myStruct;   // creating object of structure
    strcpy(myStruct.name, "Dr Tarkeshwar Barua");
   //=;
    myStruct.salary=100;
    myStruct.grade='A';
    printf("%d", myStruct.salary);
    printf("%c", myStruct.grade);
    printf("\n%s", myStruct.name);
    return 0;
}
