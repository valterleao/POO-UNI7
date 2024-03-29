public class Professor extends Funcionario{

  private String escolaridade;

  public Professor(String nome, Funcao funcao, String dnasci, double salario, String escolaridade){
    super(nome, funcao, dnasci, salario);
    this.escolaridade = escolaridade;
  }
   
  public int getMatricula(){
    return super.getMatricula();
  }

  public String getNome(){
    return super.getNome();
  }

  public Funcao getFuncao(){
    return super.getFuncao();
  }
  public double getSalario(){
    return super.getSalario();
  }

  public String getDnasci() {      
    return super.getDnasci();
  }

  public String getDadmis() {      
    return super.getDadmis();
  }

  public String getEscolaridade(){
    return escolaridade;
  }

  public void setEscolaridade(String escolaridade){
    this.escolaridade = escolaridade;
  }
  
  public void Exibecad(){
    System.out.println("Matricula : " + getMatricula());
    System.out.println("Data Admissão : " + getDadmis());
    System.out.println("Nome : " + getNome());
    System.out.println("Data Nascimento : " + getDnasci());
    System.out.println("Funçao : " + getFuncao());
    System.out.println("Salario : " + getSalario());
    System.out.println("Escolaridade : " + escolaridade);
    System.out.println();
    }
}