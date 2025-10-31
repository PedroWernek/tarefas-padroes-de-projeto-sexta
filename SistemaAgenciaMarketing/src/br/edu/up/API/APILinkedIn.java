package br.edu.up.API;

import br.edu.up.payloader.plLinkendIn;
import java.util.List;

public class APILinkedIn extends absAPI<plLinkendIn>{

    public APILinkedIn(plLinkendIn payload) {
        super(payload);
    }
  
  public void publicarVaga(String textoVaga, List<String> competecias) {
    System.out.println("Publicando a seguinte Vaga: " + textoVaga + "Com as seguintes competencias: \n");

    StringBuilder sb = new StringBuilder();

    for (String competencia : competecias) {
      sb.append("- ").append(competencia).append(";\n");
    }
    System.out.println(sb.toString());
  }
  
  public void agendarPublicacaoVaga() {
    
  }
}
