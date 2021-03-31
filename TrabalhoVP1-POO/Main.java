import java.util.Scanner;

class Main{

  public static void main(String[] args){
    
    int opcao = 3;
    Scanner ler = new Scanner(System.in); 
    
    Data d1 = new Data(10,5,1968);
    Funcionario f1 = new Funcionario("FRANCISCO", Funcao.SECRETARIO, d1.getData(), 4000.00 );
    
    Data d2 = new Data(10,5,1986);
    Funcionario f2 = new Funcionario("VALTER LEAO", Funcao.ALUNO, d2.getData(), 250.00 );
    
    Data d3 = new Data(01,10,1996);
    Professor f3 = new Professor("DAVI LEAO", Funcao.PROFESSOR, d3.getData(), 5000.00, "3ºGRAU" );
    
    Data d4 = new Data(01,10,1996);
    Analistasistemas f4 = new Analistasistemas("MARIANA LEAO", Funcao.ANALISTA_SISTEMAS, d4.getData(), 3000.00, "JAVA", "IntelliJ IDEA" );
    
    Data d5 = new Data(25,9,2002);
    Motorista f5 = new Motorista("JOSE MARIA", Funcao.MOTORISTA, d5.getData(), 3200.00, "Categoria A/B" );
        
    Aluno a1 = new Aluno("FRANCISCO LEAO", "001.001.001-00", "SISTEMAS DA INFORMAÇÃO" );
    Aluno a2 = new Aluno("MARIANA LEAO", "001.001.002-00", "MEDICINA" );
    Aluno a3 = new Aluno("DAVI LEAO", "001.001.003-00", "CIÊNCIA DA COMPUTAÇÃO" );
    
     
    do {
       System.out.println(" Menu de opções ");
       System.out.println("---------------------");
       System.out.println("| 1 - Funcionarios  |");
       System.out.println("| 2 - Alunos        |");
       System.out.println("| 3 - Sair          | ");
       System.out.println("---------------------");
       System.out.println("Digite opção : ");
       opcao = ler.nextInt();

      switch (opcao) {
		  case 1:
		    f1.Exibecad();
        f2.Exibecad();
        f3.Exibecad();
        f4.Exibecad();
        f5.Exibecad(); 
      case 2: 
        a1.Listalunos(); 
        a2.Listalunos();
        a3.Listalunos();
      case 3:   
        break; 
      default:
			  System.out.println("Opção Inválida!");
			  break;  
      }
    } while (opcao != 3);

  }

}
