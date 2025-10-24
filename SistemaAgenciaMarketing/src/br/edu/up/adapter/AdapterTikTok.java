package br.edu.up.adapter;

import java.util.ArrayList;

import br.edu.up.API.APITikTok;

public class AdapterTikTok extends absAdapterRedesSociais{
  public String payload;
  private APITikTok apiTikTok;

  public AdapterTikTok(APITikTok apiTikTok){
    this.apiTikTok = apiTikTok;
  }

  public void enviar(){
    apiTikTok.publicarTikTok("", "", new ArrayList<>());
  }
}
