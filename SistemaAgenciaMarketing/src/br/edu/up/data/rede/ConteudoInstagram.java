package br.edu.up.data.rede;

import br.edu.up.data.absConteudo;

import java.util.List;

public class ConteudoInstagram implements absConteudo {
    public String subtitle;
    public String video;
    public List<String> hashtags;

    public ConteudoInstagram(String subtitle, String video, List<String> hashtags) {
        this.subtitle = subtitle;
        this.video = video;
        this.hashtags = hashtags;
    }
}
