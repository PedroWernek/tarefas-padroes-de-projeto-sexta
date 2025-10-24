package br.edu.up.adapter;

import br.edu.up.API.APITwitter;

public class AdapterTwitter extends absAdapterRedesSociais{
  public String payload;
  public APITwitter apiTwitter;

  public AdapterTwitter(APITwitter apiTwitter){
    this.apiTwitter = apiTwitter;
  }

  public void enviar(){
    apiTwitter.publicarTwitch("", "");
  }
}
