
public class Funcionario{
    
    private static Funcao funcao;
    private static int matricula;
    private String nome;
    private double salario;
    private String dnasci, dadmis;
    
    public Funcionario(String nome, Funcao funcao, String dnasci, double salario){
      this.matricula = matricula + 1;
      this.nome = nome;
      this.funcao = funcao;
      this.dnasci = dnasci;
      this.salario = salario;
      this.dadmis = "01/01/2021";
    }
    
    public int getMatricula(){
      return matricula;
    }
    
    public void setMatricula(int matricula) {
      this.matricula = matricula;
    }   
    
    public String getNome(){
      return nome;
    }

    public void SetNome(String nome){
      this.nome = nome;
    }

    public Funcao getFuncao(){
      return funcao;
    }
    
    public void setFuncao(Funcao funcao){
      this.funcao = funcao;
    }

    public double getSalario(){
      return salario;
    }

    public void setSalario(double salario){
      this.salario = salario;
    }

    public String getDnasci() {      
      return dnasci;
    }

    public void setDnasci(String dnasci){     
      this.dnasci = dnasci;
    }

    public String getDadmis() {      
      return dadmis;
    }
    
    public void setDadmis(String dadmis){     
      this.dadmis = dadmis;
    }

    public void Exibecad(){
      System.out.println("Matricula : " + matricula);
      System.out.println("Data Admissão : " + dadmis);
      System.out.println("Nome : " + nome);
      System.out.println("Data Nascimento : " + dnasci);
      System.out.println("Funçao : " + funcao);
      System.out.println("Salario : " + salario);
      System.out.println();
    }
}