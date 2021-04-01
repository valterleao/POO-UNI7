

class Duasdimensoes{

  public static void main(String[] args){
    int i, t;
    int tabela[][] = new int[3][4];

    for(t=0; t<3; ++t){
      for(i=0; i < 4; ++i){
        tabela[t][i] = (t*4)+i+1;
       
        if(tabela[t][i] < 10){
          System.out.print(" " + tabela[t][i] + " ");
        }
        else{
          System.out.print(tabela[t][i] + " ");
        }
     
      }
      System.out.println();
    }

  }
}