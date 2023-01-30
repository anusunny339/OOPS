#include<stdio.h>
void main(void){
    FILE *file;
    printf("Welcome to C languiage");
    //file=fopen("abc.txt","r");
    file=fopen("xyz.txt","w");
    fprintf(file,"My xyz file text");
    fclose(file);
    //return 0;
}