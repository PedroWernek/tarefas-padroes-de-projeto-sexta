package br.edu.up.API;

import br.edu.up.payloader.plTwitter;

public class APITwitter extends absAPI<plTwitter>{

  public APITwitter(plTwitter payload) {
    super(payload);
  }

  public void publicarTwitch(String texto, String imagem) {
    System.out.println("Publicando o Twitch com o seguinte texto:" + texto +" e a seguinte imagem" + imagem);
  }
  
  public void agendarPublicacaoTwitch(){

  }
}
