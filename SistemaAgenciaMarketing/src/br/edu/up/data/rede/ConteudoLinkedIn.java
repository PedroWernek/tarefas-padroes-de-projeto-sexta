package br.edu.up.data.rede;

import br.edu.up.data.absConteudo;

import java.util.List;

public class ConteudoLinkedIn implements absConteudo {
    public String textoVaga;
    public List<String> competecias;

    public ConteudoLinkedIn(String textoVaga, List<String> competecias) {
        this.textoVaga = textoVaga;
        this.competecias = competecias;
    }
}
