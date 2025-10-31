package br.edu.up.adapter;

import br.edu.up.API.APILinkedIn;
import java.util.ArrayList;

public class AdapterLinkedIn implements iAdapterRedesSociais{
  public APILinkedIn apiLinkedIn;

  public AdapterLinkedIn(APILinkedIn apiLinkedIn) {
    this.apiLinkedIn = apiLinkedIn;
  }

  @Override
  public void enviar(){
    apiLinkedIn.publicarVaga("", new ArrayList<>());
  }
}
