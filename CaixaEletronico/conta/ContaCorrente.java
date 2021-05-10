package conta;

public class ContaCorrente extends ContaBanco {

  public void calcularRendConta() {
    double saldoAtual = getSaldo();
    double rendimento = saldoAtual * 0.03;
    setSaldo(saldoAtual + rendimento);
  }

  public String getTipo() {
    return "Conta Corrente";

  }

  public void imprimir() {
    System.out.println( getTipo() + getConta() + "...");
  }

}