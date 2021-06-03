<<<<<<< HEAD

package conta;

public abstract class ContaBanco {  
=======
package conta;

public abstract class ContaBanco implements ImprimirConta {
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a

  private String nome;
  private String cpf;
  private int conta;
  private int agencia;
<<<<<<< HEAD
  private DataCadastro dnasci;
  private DataCadastro dabert;
  private double saldo;

=======
  private double saldo;

  public abstract void calcularRendPoupanca();
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a
  public abstract String getTipo();

  public int getAgencia() {
    return agencia;
  }

  public int getConta() {
    return conta;
  }

  public String getCpf() {
    return cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public void setConta(int conta) {
    this.conta = conta;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

<<<<<<< HEAD
  
=======
  public void imprimir() {
    System.out.println("Conta : " + getConta() + "...");
  }
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a

}