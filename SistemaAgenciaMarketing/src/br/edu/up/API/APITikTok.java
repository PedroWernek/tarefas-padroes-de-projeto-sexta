package br.edu.up.API;

import br.edu.up.payloader.plTiktok;
import java.util.List;

public class APITikTok extends absAPI<plTiktok>{

    public APITikTok(plTiktok payload) {
        super(payload);
    }

  public void publicarTikTok(String video, String subtitle , List<String> hashtags) {
    System.out.println("Publicando tiktok com o video: " + video + "\ne o subtitulo: " + subtitle + "Com as seguintes hashtags: \n");

    StringBuilder sb = new StringBuilder();

    for (String hashtag : hashtags) {
      sb.append("#").append(hashtag).append(" ");
    }
    System.out.println(sb.toString());
  }
  
  public void agendarPublicacaoTiktok() {
    
  }
}
