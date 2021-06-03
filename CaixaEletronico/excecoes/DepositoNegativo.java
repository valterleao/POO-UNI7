package excecoes.*;

public class DepositoNegativo extends Exception {

  public DepositoNegativo(String mensagem) {
    super(mensagem);
  }

}