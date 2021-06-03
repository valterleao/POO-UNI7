package conta;
<<<<<<< HEAD
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
=======

public class ContaCorrente extends ContaBanco {

  public void calcularRendConta() {
    double saldoAtual = getSaldo();
    double rendimento = saldoAtual * 0.03;
    setSaldo(saldoAtual + rendimento);
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a
  }

  public String getTipo() {
    return "Conta Corrente";

  }

<<<<<<< HEAD
=======
  public void imprimir() {
    System.out.println( getTipo() + getConta() + "...");
  }

>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a
}