public class Professor extends Funcionario {

  private String escolaridade;

  public Professor(String nome, Funcao funcao, String dnasci, double salario, String escolaridade){
    Super(nome, funcao, dnasci, salario);
    this.escolaridade = escolaridade;
  }
   
  public String getEscolaridade(){
    return escolaridade;
  }

  public void setEscolaridade(String escolaridade){
    this.escolaridade = escolaridade;
  }
  
  public void Exibeesc(){
    System.out.println("Escolaridade : " + escolaridade);
    System.out.println();
  }
}