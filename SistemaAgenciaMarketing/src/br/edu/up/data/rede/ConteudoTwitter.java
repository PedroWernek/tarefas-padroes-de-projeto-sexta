package br.edu.up.data.rede;

import br.edu.up.data.absConteudo;

public class ConteudoTwitter implements absConteudo {
    public String texto;
    public String imagem;

    public ConteudoTwitter(String texto, String imagem) {
        this.texto = texto;
        this.imagem = imagem;
    }
}
