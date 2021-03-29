public class Analistasistemas extends Funcionario{

  private String linguagemprog;
  private String idefavorita;

  public Analistasistemas(String nome, Funcao funcao, String dnasci, double salario, String linguagemprog, String idefavorita){
    super(nome, funcao, dnasci, salario);
    this.linguagemprog = linguagemprog;
    this.idefavorita = idefavorita;
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

  public String getDnasci(){      
    return super.getDnasci();
  }

  public String getDadmis(){      
    return super.getDadmis();
  }

  public String getLinguagemprog(){
    return linguagemprog;
  }

  public void setLinguagemprog(String linguagemprog){
    this.linguagemprog = linguagemprog;
  }
  
  public String getIdefavorita(){
    return idefavorita;
  }

  public void setIdefavorita(String idefavorita){
    this.idefavorita = idefavorita;
  }

  public void Exibecad(){
    System.out.println("Matricula : " + getMatricula());
    System.out.println("Data Admissão : " + getDadmis());
    System.out.println("Nome : " + getNome());
    System.out.println("Data Nascimento : " + getDnasci());
    System.out.println("Funçao : " + getFuncao());
    System.out.println("Salario : " + getSalario());
    System.out.println("Linguagem de programação : " + linguagemprog);
    System.out.println("Ide favorita : " + idefavorita);
    System.out.println();
    }
}