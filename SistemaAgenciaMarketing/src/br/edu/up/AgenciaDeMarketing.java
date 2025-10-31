package br.edu.up;

import br.edu.up.factory.SocialMidiaFactory;

public class AgenciaDeMarketing {
    public static void main(String[] args) throws Exception {
        GerenciadorMidiaSocial gerenciador = new GerenciadorMidiaSocial(SocialMidiaFactory.criarInstagram("apiKey"));

        gerenciador.enviar();
        gerenciador.setAdapter(SocialMidiaFactory.criarTikTok("conectionString"));
        gerenciador.enviar();
    }
}
