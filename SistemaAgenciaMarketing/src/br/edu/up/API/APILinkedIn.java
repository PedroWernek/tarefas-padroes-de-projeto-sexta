package br.edu.up.API;

import java.util.List;

public class APILinkedIn{

  public void publicarVaga(String textoVaga, List<String> competecias) {
    System.out.println("Publicando a seguinte Vaga: " + textoVaga + "Com as seguintes competencias: \n");

    StringBuilder sb = new StringBuilder();

    for (String competencia : competecias) {
      sb.append("- " + competencia + ";\n");
    }
    System.out.println(sb.toString());
  }
  
  public void agendarPublicacaoVaga() {
    
  }
}
