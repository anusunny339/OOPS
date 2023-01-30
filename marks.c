#include <stdio.h>
#include <stdlib.h>
int main()
{
    int mark = 0;
    printf("Please Enter score : ");
    scanf("%d", &mark);
    printf("Your score is : %d", mark);
    if (mark < 50)
    {
        printf("You Failed This exam");
    }
    else if (mark < 70)
    {
        printf("A Grade");
    }
    else
    {
        printf("A+ grade");
    }
    return (0);
}
