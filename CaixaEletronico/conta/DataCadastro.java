package conta;

class DataCadastro{
  
  private final int dia;
  private final int mes;
  private final int ano;

  int dia;
  int mes;
  int ano;

<<<<<<< HEAD
  public DataCadastro(int dia, int mes, int ano) {
=======
  public Data(int dia, int mes, int ano) {
>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a
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

<<<<<<< HEAD
  public String getData() {
    return dia + "/" + mes + "/" + ano;
  }

  public String toString() {
    return getData();
  }
=======
  public void DataCadastro(){
    System.out.println("Data Abertura da Conta é :" + dia + "/" + mes + "/" + ano);
  }

>>>>>>> 4ae79aefdf6794a6d3b8636885700d9ddd484a2a
}