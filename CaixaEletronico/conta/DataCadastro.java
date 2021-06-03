package conta;

class DataCadastro{
  
  private final int dia;
  private final int mes;
  private final int ano;

  int dia;
  int mes;
  int ano;

  public DataCadastro(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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