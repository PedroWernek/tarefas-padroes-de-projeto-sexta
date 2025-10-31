package br.edu.up.adapter;

import br.edu.up.API.APITwitter;

public class AdapterTwitter implements iAdapterRedesSociais{

  public APITwitter apiTwitter;

  public AdapterTwitter(APITwitter apiTwitter) {
    this.apiTwitter = apiTwitter;
  }
  @Override
  public void enviar(){
    apiTwitter.publicarTwitch("", "");
  }
}
