package br.edu.up;

import br.edu.up.factory.SocialMidiaFactory;

import javax.swing.*;

public class AgenciaDeMarketing {

    public static void main(String[] args) throws Exception {
        GerenciadorMidiaSocial gerenciador = new GerenciadorMidiaSocial(SocialMidiaFactory.criarInstagram("apiKey"));

        JFrame mainFrame = new MainFrame("Tela Inicial", gerenciador);
        mainFrame.setVisible(true);
    }
}
