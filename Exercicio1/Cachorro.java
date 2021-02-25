
class Cachorro {
  
   private String raca;
   private String nome;
   private int comprimentoDoPelo;
   private int idade;
   private int peso;

   public Cachorro(){
     this.nome = null;
     this.raca = null;
     this.peso = 1;
     this.comprimentoDoPelo = 10;
   }
   
   public Cachorro(String raca, String nome, int peso, int comprimentoDoPelo, int idade){
     this.nome = nome;
     this.raca = raca;
     this.peso = peso;
     this.idade = idade;
     this.comprimentoDoPelo = comprimentoDoPelo;
   }
   
   public int getComprimentoDoPelo(){
     return comprimentoDoPelo;
   }

   public int getIdade(){
     return idade;
   }
   
   public String getNome(){
     return nome;
   }

   public int setIdade(int novaIdade){
     idade = novaIdade;
   }
   

   public void latir(){
     if (peso > 10)
       System.out.println(nome + " Woof woof...");
     else
       System.out.println(nome + "Auauauauauauaua...");
   }

   public void andar(int distancia){
     System.out.println("Andar " + raca.charAt(0));
   }


}