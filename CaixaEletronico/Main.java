import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import conta.*;
import excecoes.*;


class Main{

  public static void main(String[] args){

    ContaBanco CC = new ContaCorrente();
    ContaBanco CP = new ContaPoupanca();
    Scanner ler = new Scanner(System.in);

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
        System.out.println("---------------------------------------");
        System.out.println("| 3   - Mostrar informações da conta  |");
        System.out.println("| 0   - Volta ao Menu anterior        |");
        System.out.println("---------------------------------------");
        System.out.println("Digite opção : ");
        opcao = ler.nextInt();
      case 4:     // Finalizar conta bancaria
        System.out.println("| 4 - Finalizar Conta Bancaria     |");
      case 5:     // sair do sistema
        break; 
      default:
			  System.out.println("Opção Inválida!");
			  break;  
      }

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
 