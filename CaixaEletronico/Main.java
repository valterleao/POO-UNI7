import java.util.Scanner;
import conta.*;


class Main{

  public static void main(String[] args){
    
    ContaPoupanca poupanca = new ContaPoupanca();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    do {
       System.out.println(" Menu Caixa Eletronico ");
       System.out.println("---------------------------------------");
       System.out.println("| 1 - Abrir Conta Bancária            |");
       System.out.println("| 2 - Realizar Transações Financeiras |");
       System.out.println("| 3 - Exibir Informações da Conta     |");
       System.out.println("| 4 - Finalizar Conta Bancária        |");
       System.out.println("| 5 - Sair                            |");
       System.out.println("---------------------------------------");
       System.out.println("Digite opção : ");
       opcao = ler.nextInt();

      
      switch (opcao) {
		  case 1:    // abrir conta
		    System.out.println(" Menu Abertura de conta ");
        System.out.println("--------------------------------");
        System.out.println("| 1.1 - Abrir Conta Corrente   |");
        System.out.println("| 1.2 - Abrir Conta Poupanca   |");
        System.out.println("| 0   - Volta ao Menu anterior |");
        System.out.println("--------------------------------");
        System.out.println("Digite opção : ");
        opcao = ler.nextInt();

      case 2:    // realizar transacoes
        System.out.println(" Menu Transações financeiras  ");
        System.out.println("--------------------------------");
        System.out.println("| 2.1 - Saque                  |");
        System.out.println("| 2.2 - Deposito               |");
        System.out.println("| 2.3 - Transferencias         |");
        System.out.println("| 0   - Volta ao Menu anterior |");
        System.out.println("--------------------------------");
        System.out.println("Digite opção : ");
        opcao = ler.nextInt();
      case 3:    // exibir informações da conta
        System.out.println(" Menu Informações da conta ");
        System.out.println("--------------------------------");
        System.out.println("| 1.1 - Abrir Conta Corrente   |");
        System.out.println("| 1.2 - Abrir Conta Poupanca   |");
        System.out.println("| 0   - Volta ao Menu anterior |");
        System.out.println("--------------------------------");
        System.out.println("Digite opção : ");
        opcao = ler.nextInt();
      case 4:    // Finalizar conta bancaria

      case 5:    // sair do sistema
        break; 
      default:
			  System.out.println("Opção Inválida!");
			  break;  
      }
      
      
      
      
      try {
        if (opcao == 1) {
          System.out.print("Digite o valor a ser sacado: ");
          int valor = scanner.nextInt();
          poupanca.sacar(valor);
          System.out.println("Valor sacado com sucesso");
        }
        if (opcao == 2) {
          System.out.print("Digite o valor a ser depositado: ");
          int valor = scanner.nextInt();
          poupanca.depositar(valor);
          System.out.println("Valor depositado com sucesso");
        }
      } catch (Exception e) {
        System.out.println("Ocorreu um erro." + e.getMessage());
      }


    } while (opcao = 5);
    System.out.print("Saindo do sistema");
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
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
       System.out.println(" Menu Caixa Eletronico ");
       System.out.println("---------------------");
       System.out.println("| 1 - Abrir Conta Bancária            |");
       System.out.println("| 2 - Realizar Transações Financeiras |");
       System.out.println("| 3 - Exibir Informações da Conta     |");
       System.out.println("| 4 - Finalizar Conta Bancária        |");
       System.out.println("| 5 - Sair                            |");
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
