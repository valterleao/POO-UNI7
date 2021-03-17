public class Data{
  
  private final int dia;
  private final int mes;
  private final int ano;

  public Data(int D, int M, int A) {
		this.dia = D;
		this.mes = M;
		this.ano = A;
	}

  public int getDia(){
    return dia;
  }

  public int getMes(){
    return mes;
  }

  public int getAno(){
    return ano;
  }

  public String getData() {
    return dia + "/" + mes + "/" + ano;
  }

  public String toString() {
    return getData();
  }

}