/* Demonstra a classificação por bolha */

class Bolha{
<<<<<<< HEAD
  public static void main(String[] args){
=======
  public static void main(String args[]){
>>>>>>> 4679e0dceacbe4ac989daf37c5d9913bdad97c89
    int numeros[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
    int a, b, t;
    int tamanho;

    tamanho = 10;  // número de elementos a serem classificados

    System.out.print("O array original é : ");
    for (int i=0; i < tamanho; i++)
      System.out.print(" " + numeros[i]);
    System.out.println();

    for(a=1; a< tamanho; a++)
      for(b=tamanho-1; b >= a; b--){
        if(numeros[b-1] > numeros[b]) {   //verifica se está fora de ordem
          t = numeros[b-1];
          numeros[b-1] = numeros[b];
          numeros[b] = t;  
        }
    }

    System.out.print("A ordem do array após classificação é :");
    for (int i=0; i < tamanho; i++)
      System.out.print(" " + numeros[i]);
    System.out.println();
  }
}