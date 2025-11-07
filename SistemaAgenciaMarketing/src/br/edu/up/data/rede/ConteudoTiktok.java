package br.edu.up.data.rede;

import br.edu.up.data.absConteudo;

import java.util.List;

public class ConteudoTiktok implements absConteudo {
    public String video;
    public String subtitle;
    public List<String> hashtags;

    public ConteudoTiktok(String video, String subtitle, List<String> hashtags) {
        this.video = video;
        this.subtitle = subtitle;
        this.hashtags = hashtags;
    }
}
