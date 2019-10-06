#include <stdio.h>
#include <stdlib.h>

int main()
{
    float a[100], n;
    for(int i = 0; i<100; i++){
        scanf("%f", &n);
        a[i] = n;
    }
    for(int j = 0; j<100; j++){
        if(a[j]<=10){
            printf("A[%d] = %.1f\n", j, a[j]);
        }
    }
    return 0;
}
