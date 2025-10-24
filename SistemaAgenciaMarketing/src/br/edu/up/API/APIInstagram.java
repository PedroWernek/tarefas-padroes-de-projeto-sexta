package br.edu.up.API;

import java.util.List;

public class APIInstagram {
  public String apiKey;

  public void publicarReel(String subtitle,String video, List<String> hashtags) {
    System.out.println("Publicando Reel com o video: " + video + "\ne o subtitulo: " + subtitle  + "Com as seguintes hashtags: \n");

    StringBuilder sb = new StringBuilder();

    for (String hashtag : hashtags) {
      sb.append("#" + hashtag + " ");
    }
    System.out.println(sb.toString());
  }

  public void agendarReel() {
    
  }
}
