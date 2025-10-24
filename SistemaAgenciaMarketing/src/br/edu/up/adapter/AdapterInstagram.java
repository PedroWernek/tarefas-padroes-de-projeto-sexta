package br.edu.up.adapter;

import java.util.ArrayList;

import br.edu.up.API.APIInstagram;

public class AdapterInstagram extends absAdapterRedesSociais{
  public String payload;
  public APIInstagram apiInstagram;
  
  public AdapterInstagram(APIInstagram apiInstagram){
    this.apiInstagram = apiInstagram;
  }

  public void enviar(){
    apiInstagram.publicarReel("", "", new ArrayList<>());
  }
}
