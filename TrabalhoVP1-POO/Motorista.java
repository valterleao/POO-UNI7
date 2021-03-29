public class Motorista extends Funcionario{

  private String categoriahabil;

  public Motorista(String nome, Funcao funcao, String dnasci, double salario, String categoriahabil){
    super(nome, funcao, dnasci, salario);
    this.categoriahabil = categoriahabil;
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

  public String getCategoriahabil(){
    return categoriahabil;
  }

  public void setCategoriahabil(String categoriahabil){
    this.categoriahabil = categoriahabil;
  }
  
  public void Exibecad(){
    System.out.println("Matricula : " + getMatricula());
    System.out.println("Data Admissão : " + getDadmis());
    System.out.println("Nome : " + getNome());
    System.out.println("Data Nascimento : " + getDnasci());
    System.out.println("Funçao : " + getFuncao());
    System.out.println("Salario : " + getSalario());
    System.out.println("Categoria de Habilitação : " + categoriahabil);
    System.out.println();
    }
}