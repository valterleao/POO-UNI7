class Carro{
  
  private int motor;
  private int velocidadeMaxima;
  private int cor;
  private String montadora;
  private int pneu;
  private int velocidadeAtual;
  private boolean ligado;

  public Carro(int motor, int velocidadeMaixma, int cor) {
		this.motor = motor;
		this.velocidadeMaixma = velocidadeMaixma;
		this.cor = cor;
    this.montadora = montadora;
    this.pneu = pneu;
    this.velocidadeAtual = velocidadeAtual;
    this.ligado = ligado;
	}

  public getLigar(){
    if ligado = false
      ligado = true;
  }

  public getDesligar(){
    if ligado = true
      ligado = false;
  }

  public getAcelerar(){
    velocidadeAtual = velocidadeAtual + 1;
  }
  
  public getFrear(){
    velocidadeAtual = 0;
  }

  public getAcelerar(){
    velocidadeAtual = velocidadeAtual + 1;
  }
  
  public getVelocidadeAtual(){
    return velocidadeAtual;
  }
  
  public void exibeVelocidadeAtual(){
    System.out.println("Velocidade Atual é " + velocidadeAtual);
  }

}