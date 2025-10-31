package br.edu.up.API;

import br.edu.up.payloader.plInstagram;
import java.util.List;

public class APIInstagram extends absAPI<plInstagram> {

    public APIInstagram(plInstagram payload) {
        super(payload);
    }

    public void publicarReel(String subtitle, String video, List<String> hashtags) {
        System.out.println("Publicando Reel com o video: " + video + "\ne o subtitulo: " + subtitle + "Com as seguintes hashtags: \n");

        StringBuilder sb = new StringBuilder();

        for (String hashtag : hashtags) {
            sb.append("#").append(hashtag).append(" ");
        }
        System.out.println(sb.toString());
    }

    public void agendarReel() {

    }
}
