class Main{

  public static void main(String[] args){

    Data d1 = new Data(10,5,1968);
    Funcionario f1 = new Funcionario("FRANCISCO", Funcao.ANALISTA_SISTEMAS, d1.getData(), 4000.00 );
    f1.Exibecad();     

    Data d2 = new Data(10,5,1986);
    Funcionario f2 = new Funcionario("VALTER", Funcao.ALUNO, d2.getData(), 250.00 );
    f2.Exibecad(); 

    Data d3 = new Data(01,10,1996);
    Professor f3 = new Professor("DAVI", Funcao.PROFESSOR, d3.getData(), 5000.00, "3ºGRAU" );
    f3.Exibecad();
    f3.Exibeesc();

  }

}
