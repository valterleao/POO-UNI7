class Data{
  
<<<<<<< HEAD
  private final int dia;
  private final int mes;
  private final int ano;
=======
  int dia;
  int mes;
  int ano;
>>>>>>> b7e60dd12d1cf14d5d8bfbf098e5f104f3c48759

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

  public void exibeData(){
    System.out.println("A data informada é " + dia + "/" + mes + "/" + ano);
  }

}