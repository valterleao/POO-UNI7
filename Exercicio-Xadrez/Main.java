import java.util.*;

public class Main {

  public static void main(String[] args) {

    String posicaopeao = "PARA FRENTE";
    String posicaocavalo = "EM L";
    String posicaobispo = "NA DIAGONAL";

    Pecaxadrez pecaxadrez = new Pecaxadrez();
    pecaxadrez.jogada();

    Peao peao = new Peao();    
    peao.jogada(posicaopeao);
    
    Cavalo cavalo = new Cavalo(); 
    cavalo.jogada(posicaocavalo);

    Bispo bispo = new Bispo(); 
    bispo.jogada(posicaobispo);
    
  }

  
}