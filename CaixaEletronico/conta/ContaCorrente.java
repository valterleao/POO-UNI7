package conta;
import excecoes.*;

public class ContaCorrente extends ContaBanco {

  private double saldo;

  public ContaCorrente() {
    this.saldo = 0;
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

  public String getTipo() {
    return "Conta Corrente";

  }

}