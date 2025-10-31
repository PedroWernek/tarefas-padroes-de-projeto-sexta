package br.edu.up.adapter;

import br.edu.up.API.APITikTok;
import java.util.ArrayList;

public class AdapterTikTok implements iAdapterRedesSociais{
  public APITikTok apiTikTok;

  public AdapterTikTok(APITikTok apiTikTok) {
    this.apiTikTok = apiTikTok;
  }

  @Override
  public void enviar(){
    apiTikTok.publicarTikTok("", "", new ArrayList<>());
  }
}
