package br.edu.up.adapter;

import br.edu.up.API.APILinkedIn;
import br.edu.up.data.Publicacao;
import br.edu.up.data.rede.ConteudoLinkedIn;

import java.util.ArrayList;

public class AdapterLinkedIn implements iAdapterRedesSociais{
  public APILinkedIn apiLinkedIn;

  public AdapterLinkedIn(APILinkedIn apiLinkedIn) {
    this.apiLinkedIn = apiLinkedIn;
  }

  @Override
  public void enviar(Publicacao publicacao){
        ConteudoLinkedIn conteudoLinkedIn = (ConteudoLinkedIn) publicacao.conteudo;
        apiLinkedIn.publicarVaga(conteudoLinkedIn.textoVaga, conteudoLinkedIn.competecias);
  }
}
