package br.edu.up;

import br.edu.up.factory.SocialMidiaFactory;
import br.edu.up.view.MainFrame;

import javax.swing.*;

public class AgenciaDeMarketing {

    public static void main(String[] args) throws Exception {
        //é obrigatório ele estar iniciado :(
        GerenciadorMidiaSocial gerenciador = new GerenciadorMidiaSocial(SocialMidiaFactory.criarInstagram(""));

        //tela principal que controla o registro das payloads para a postagem
        JFrame mainFrame = new MainFrame("Tela Inicial", gerenciador);
        mainFrame.setVisible(true);
    }
}
