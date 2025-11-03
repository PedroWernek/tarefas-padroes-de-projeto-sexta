package br.edu.up.adapter;

import br.edu.up.API.APITwitter;
import br.edu.up.data.Publicacao;
import br.edu.up.data.rede.ConteudoTwitter;

public class AdapterTwitter implements iAdapterRedesSociais{

  public APITwitter apiTwitter;

  public AdapterTwitter(APITwitter apiTwitter) {
    this.apiTwitter = apiTwitter;
  }
  @Override
  public void enviar(Publicacao publicacao){
    apiTwitter.publicarTwitch(publicacao((ConteudoTwitter).conteudo).texto), "");
  }
}
