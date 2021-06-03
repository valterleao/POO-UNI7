package excecoes.*;

public class SaldoNegativo extends Exception {

  public SaldoInsuficiente(String mensagem) {
    super(mensagem);
  }

}