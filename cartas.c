#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct
{
  int tam;
  int cartas[51];
} Cards;

int remove_top_move_base(Cards *p)
{
  int i, res;
  if (p->tam)
  {
    //Remover do topo
    res = p->cartas[--p->tam];
    int topo = p->cartas[p->tam - 1];
    for (i = p->tam - 1; i >= 0; i--)
      p->cartas[i + 1] = p->cartas[i];
    
    //Mover topo para base
    p->cartas[0] = topo;
  }

  //Add removida no discard
  return res;
}

int main(void)
{
  int n, i, j;
  while (1)
  {
    scanf("%d", &n);
    if (n == 0)
      break;

    Cards numns;
    int discard[n - 1], k = 0;
    numns.tam = n;

    for (i = n; i >= 1; i--)
      numns.cartas[n - i] = i;

    while (numns.tam >= 2)
    {
      discard[k++] = remove_top_move_base(&numns);
    }
    printf("Discarded cards: ");
    for (i = 0; i < n-1; i++){
      if(i < n-2)
        printf("%d, ", discard[i]);
      else
        printf("%d", discard[i]);
    }
    printf("\nRemaining card: %d\n", numns.cartas[numns.tam - 1]);
  }
}
