package conta;

public class ContaPoupanca extends ContaBanco {

  private static double rendPoupanca;
  private double saldo;

  public ContaPoupanca() {
    this.saldo = 0;
  }

  public void calcularRendConta() {
    
    double saldoAtual = getSaldo();  
    double rendimento;

    if (rendPoupanca > 10) {
      rendimento = saldoAtual * (0.02/12);
    }
    else {
      rendimento = rendPoupanca * 0.10;
    }

    setSaldo(saldoAtual + rendimento);
  }

  public String getTipo() {
    return "Conta Poupanca";
  }

  public static double getRedimentoc() {
    return rendPoupanca;
  }

  public static void setRendimento(double rendimento) {
    rendPoupanca = rendimento;
  }

  public void depositar(double dinheiro) throws DepositoNegativo {
    if (dinheiro <= 0) {
      throw new DepositoNegativo("o envelope não contem dinheiro, está vazio. Repita a operação.");
    }
    this.saldo += dinheiro;
  }

  public void sacar(double dinheiro) throws SaldoNegativo {
   
    if (dinheiro < 0) {
      throw new SaldoNegativo("Você tem apenas R$ " + this.saldo + " de saldo");
    }

    this.saldo -= dinheiro;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void imprimir() {
    System.out.println( getTipo() + getConta() + "...");
  }

}
