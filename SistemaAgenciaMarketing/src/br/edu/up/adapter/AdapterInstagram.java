package br.edu.up.adapter;

import br.edu.up.API.APIInstagram;
import java.util.ArrayList;

public class AdapterInstagram implements iAdapterRedesSociais{
  public APIInstagram apiInstagram;
  
  public AdapterInstagram(APIInstagram apiInstagram){
    this.apiInstagram = apiInstagram;
  }

  @Override
  public void enviar(){
    apiInstagram.publicarReel("", "", new ArrayList<>());
  }
}
