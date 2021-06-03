<<<<<<< HEAD
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import conta.*;
import excecoes.*;
=======
import java.util.Scanner;
import conta.*;
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a


class Main{

  public static void main(String[] args){
<<<<<<< HEAD

    ContaBanco CC = new ContaCorrente();
    ContaBanco CP = new ContaPoupanca();
    Scanner ler = new Scanner(System.in);
=======
    
    ContaPoupanca poupanca = new ContaPoupanca();
    Scanner scanner = new Scanner(System.in);
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a

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
<<<<<<< HEAD
        System.out.println("---------------------------------------");
        System.out.println("| 3   - Mostrar informações da conta  |");
        System.out.println("| 0   - Volta ao Menu anterior        |");
        System.out.println("---------------------------------------");
        System.out.println("Digite opção : ");
        opcao = ler.nextInt();
      case 4:     // Finalizar conta bancaria
        System.out.println("| 4 - Finalizar Conta Bancaria     |");
      case 5:     // sair do sistema
=======
        System.out.println("--------------------------------");
        System.out.println("| 1.1 - Abrir Conta Corrente   |");
        System.out.println("| 1.2 - Abrir Conta Poupanca   |");
        System.out.println("| 0   - Volta ao Menu anterior |");
        System.out.println("--------------------------------");
        System.out.println("Digite opção : ");
        opcao = ler.nextInt();
      case 4:    // Finalizar conta bancaria

      case 5:    // sair do sistema
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a
        break; 
      default:
			  System.out.println("Opção Inválida!");
			  break;  
      }
<<<<<<< HEAD

     if (opcao == 1) {
        if (opcao == 1.1) {
          //ContaBanco CC = new ContaCorrente();
          System.out.print("Nº da Agência .....: ");
          int agencia = ler.nextInt();

          System.out.print("Nº da conta  ......: ");
          int conta = ler.nextInt();

          System.out.print("Data Abertura conta: ");
          DataCadastro dabert = ler.nextLine();

          System.out.print("Nome do cliente ..: ");
          String nome = ler.nextLine();

          System.out.print("Nº do CPF ........: ");
          String cpf = ler.nextLine();

          System.out.print("Data Nascimento ..: ");
          DataCadastro dnasci = ler.nextLine();
        
          CC.setAgencia(agencia);
          CC.setConta(conta); 
          CC.setAbert(dabert)
          CC.setNome(nome);
          CC.setCpf(cpf);
          CC.setDnasci(dnasci);
        }
        else { // senão é porque é poupança.
          //ContaBanco CP = new ContaPoupanca();
          System.out.print("Nº da Agência .....: ");
          int agencia = ler.nextInt();

          System.out.print("Nº da conta  ......: ");
          int conta = ler.nextInt();

          System.out.print("Data Abertura conta: ");
          DataCadastro dabert = ler.nextLine();

          System.out.print("Nome do cliente ..: ");
          String nome = ler.nextLine();

          System.out.print("Nº do CPF ........: ");
          String cpf = ler.nextLine();

          System.out.print("Data Nascimento ..: ");
          DataCadastro dnasci = ler.nextLine();
        
          CP.setAgencia(agencia);
          CP.setConta(conta); 
          CP.setAbert(dabert)
          CP.setNome(nome);
          CP.setCpf(cpf);
          CP.setDnasci(dnasci);
        } 
      }
    if (opcao == 2) {
      if (opcao == 2.1) {          // saque
         System.out.print("Informe o valor do saque .....: ");
         int dinheiro = ler.nextInt();
         System.out.print("Vai sacar da (P)oupança ou (C)onta corrente...: ");
         String tipo = ler.next();
         if (tipo == "C") {
           CC.sacar(dinheiro);
         }
         else {
           CP.sacar(dinheiro);
         }
      }
      else if (opcao == 2.2) {     // depsoito
         System.out.print("Informe o valor do deposito .....: ");
         int dinheiro = ler.nextInt();
         System.out.print("Vai depositar na (P)oupança ou (C)onta corrente...: ");
         String tipo = ler.next();
         if (tipo == "C") {
           CC.depositar(dinheiro);
         }
         else {
           CP.depositar(dinheiro);
         }
      }
      else if (opcao == 2.3) {     // transferir
        
      }
     else if (opcao == 3){          // mostra opçoes da conta

     } 
    }

   } while (opcao == 5);
    System.out.print("Saindo do sistema");
  }
    
} 
 
=======
      
      
      
      
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
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a
