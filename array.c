#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int main()
{
    int numbers[] = {2, 5, 6, 5, 7, 3, 6, 7}; // indexing begines from 0 and up to lenth -1
    char fruits[] = {'a', 'b', 'c'};
    int multidimen[2][2] = {{1, 2}, {3, 4}};
    printf("%d\n", numbers[3]);
    printf("%c", fruits[1]);
    for (int i = 0; i < 2; i++)
    {
        //printf("\nitem %d", multidimen[i]);
        for (int j = 0; j < 2; j++)
        {
            printf("\t Item individual %d", multidimen[i][j]);
        }
    }
    return 0;
}
