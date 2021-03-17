public class Aluno{

  private static int codmatricula;
  private String nome;
  private String nocpf;
  private String turma;

  public Aluno(String nome, String nocpf, String turma){
    this.codmatricula = codmatricula + 1;
    this.nome = nome;
    this.nocpf = nocpf;
    this.turma = turma;
  }
    
  public int getCodmatricula(){
    return codmatricula;
  }
    
  public void setCodmatricula(int codmatricula) {
    this.codmatricula = codmatricula;
  } 

  public String getNome(){
    return nome;
  }  

  public void setNome(String nome){
    this.nome = nome;
  }  

  public String getNocpf(){
    return nocpf;
  }

  public void setNocpf(String nocpf){
    this.nocpf = nocpf;
  }

  public String getTurma(){
    return turma;
  }

  public void setTurma(String turma){
    this.turma = turma;
  }

}
