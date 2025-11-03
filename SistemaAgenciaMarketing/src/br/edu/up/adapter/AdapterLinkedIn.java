package br.edu.up.adapter;

import br.edu.up.API.APILinkedIn;
import br.edu.up.data.Publicacao;

import java.util.ArrayList;

public class AdapterLinkedIn implements iAdapterRedesSociais{
  public APILinkedIn apiLinkedIn;

  public AdapterLinkedIn(APILinkedIn apiLinkedIn) {
    this.apiLinkedIn = apiLinkedIn;
  }

  @Override
  public void enviar(Publicacao publicacao){
    apiLinkedIn.publicarVaga("", new ArrayList<>());
  }
}
