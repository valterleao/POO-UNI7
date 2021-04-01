public class Turma{

  private int codturma;
  private String disciplina;
  private String noprofessor;

  public Turma(int codturma, String disciplina, String noprofessor){
    this.codturma = codturma + 1;
    this.disciplina = disciplina;
    this.noprofessor = noprofessor;
  }

  public int getCodturma(){
    return codturma;
  }

  public void setCodturma(int codturma){
    this.codturma = codturma; 
  }

  public String getDisciplina(){
   return disciplina;
  }

  public void setDisciplina(String disciplina){
    this.disciplina = disciplina;
  }

  public String getNoprofessor(){
    return noprofessor;
  }

  public void setNoprofessor(String noprofessor){
    this.noprofessor = noprofessor;
  }
  
}
