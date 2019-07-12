#include <stdio.h>
#include <string.h>
int main()
{
    FILE *fp;
    char ch;
    int linecount = 0;
    fp = fopen("sample.txt", "r");
    char c;
    for (c = getc(fp); c != EOF; c = getc(fp)) 
        if (c == '\n') // Increment count if this character is newline 
            linecount++; 
    fclose(fp);
    printf("%d", linecount);
    return 0;
    
}