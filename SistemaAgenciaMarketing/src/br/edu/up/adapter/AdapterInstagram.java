package br.edu.up.adapter;

import br.edu.up.API.APIInstagram;
import br.edu.up.data.Publicacao;
import br.edu.up.data.rede.ConteudoInstagram;

import java.util.ArrayList;

public class AdapterInstagram implements iAdapterRedesSociais{
  public APIInstagram apiInstagram;
  
  public AdapterInstagram(APIInstagram apiInstagram){
    this.apiInstagram = apiInstagram;
  }

  @Override
  public void enviar(Publicacao publicacao){
      ConteudoInstagram conteudoInstagram = (ConteudoInstagram) publicacao.conteudo;
      apiInstagram.publicarReel(conteudoInstagram.subtitle, conteudoInstagram.video, conteudoInstagram.hashtags);
  }
}
