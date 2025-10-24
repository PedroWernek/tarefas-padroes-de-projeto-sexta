package br.edu.up.API;

import java.util.List;

public class APITikTok {
  public String conectionString;

  public void publicarTikTok(String video, String subtitle , List<String> hashtags) {
    System.out.println("Publicando tiktok com o video: " + video + "\ne o subtitulo: " + subtitle + "Com as seguintes hashtags: \n");

    StringBuilder sb = new StringBuilder();

    for (String hashtag : hashtags) {
      sb.append("#" + hashtag + " ");
    }
    System.out.println(sb.toString());
  }
  
  public void agendarPublicacaoTiktok() {
    
  }
}
