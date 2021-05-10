package conta;

class DataCadastro{
  
  private final int dia;
  private final int mes;
  private final int ano;

  int dia;
  int mes;
  int ano;

  public Data(int dia, int mes, int ano) {
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

  public void DataCadastro(){
    System.out.println("Data Abertura da Conta é :" + dia + "/" + mes + "/" + ano);
  }

}