package br.edu.up;

import br.edu.up.factory.SocialMidiaFactory;

public class AgenciaDeMarketing {

    public static void main(String[] args) throws Exception {
        GerenciadorMidiaSocial gerenciador = new GerenciadorMidiaSocial(SocialMidiaFactory.criarInstagram("apiKey"));

        MainFrame myFrame = new MainFrame();
        myFrame.iniciar();

        gerenciador.enviar();
        gerenciador.setAdapter(SocialMidiaFactory.criarTikTok("conectionString"));
        gerenciador.enviar();
    }
}
