public abstract class Produto implements Imprimivel {

  private String nome;
  private String cpf;
  private int conta;
  private int agencia;
  private double saldo;

  public abstract void calcularRendimento();
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

  public void imprimir() {
    System.out.println("Conta : " + getConta() + "...");
  }

}