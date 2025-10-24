package br.edu.up.adapter;

import java.util.ArrayList;

import br.edu.up.API.APILinkedIn;

public class AdapterLinkedIn extends absAdapterRedesSociais{
  public String payload;
  public APILinkedIn apiLinkedIn;

  public AdapterLinkedIn(APILinkedIn apiLinkedIn){
    this.apiLinkedIn = apiLinkedIn;
  }

  public void enviar(){
    apiLinkedIn.publicarVaga("", new ArrayList<>());
  }
}
