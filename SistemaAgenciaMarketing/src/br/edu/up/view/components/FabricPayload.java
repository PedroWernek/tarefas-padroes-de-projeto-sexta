package br.edu.up.view.components;

import br.edu.up.GerenciadorMidiaSocial;
import br.edu.up.factory.SocialMidiaFactory;

import javax.swing.*;

public class FabricPayload {
    public static void plComponentIntagram(JPanel plPainel, GerenciadorMidiaSocial gerenciador){
        JLabel lbApiKey = new JLabel("API Key:");
        JTextField tfApiKey = new JTextField(15); // Dê um tamanho

        plPainel.add(lbApiKey);
        plPainel.add(tfApiKey);
        JButton btnSalvarApi = new JButton();
        btnSalvarApi.setText("Mandar chave API");
        plPainel.add(btnSalvarApi);
        btnSalvarApi.addActionListener(f -> {
            gerenciador.setAdapter(SocialMidiaFactory.criarInstagram(tfApiKey.getText()));
        });
    }
    public static void plComponentLinkedIn(JPanel plPainel, GerenciadorMidiaSocial gerenciador){
        JLabel lbChaveDeAcesso = new JLabel("Chave de Acesso:");
        JTextField tfChaveDeAcesso = new JTextField(15);

        plPainel.add(lbChaveDeAcesso);
        plPainel.add(tfChaveDeAcesso);
        JButton btnSalvarChaveDeAcesso = new JButton();
        btnSalvarChaveDeAcesso.setText("Mandar chave de Acesso");
        plPainel.add(btnSalvarChaveDeAcesso);
        btnSalvarChaveDeAcesso.addActionListener(f -> {
            gerenciador.setAdapter(SocialMidiaFactory.criarLinkedIn(tfChaveDeAcesso.getText()));
        });
    }
    public static void plComponentTiktok(JPanel plPainel, GerenciadorMidiaSocial gerenciador){
        JLabel lbConectionString = new JLabel("ConectionString:");
        JTextField tfConectionString = new JTextField(15);

        plPainel.add(lbConectionString);
        plPainel.add(tfConectionString);
        JButton btnSalvarConectionString = new JButton();
        btnSalvarConectionString.setText("Mandar ConectionString");
        plPainel.add(btnSalvarConectionString);
        btnSalvarConectionString.addActionListener(f -> {
            gerenciador.setAdapter(SocialMidiaFactory.criarTikTok(tfConectionString.getText()));
        });
    }
    public static void plComponentTwitter(JPanel plPainel, GerenciadorMidiaSocial gerenciador){
        JLabel lbId = new JLabel("Id:");
        JTextField tfId = new JTextField(15);
        JLabel lbPws = new JLabel("Pws:");
        JTextField tfPws = new JTextField(15);

        plPainel.add(lbId);
        plPainel.add(tfId);
        plPainel.add(lbPws);
        plPainel.add(tfPws);

        JButton btnSalvarInformacoes = new JButton();
        btnSalvarInformacoes.setText("Mandar informações");
        plPainel.add(btnSalvarInformacoes);
        btnSalvarInformacoes.addActionListener(f -> {
            gerenciador.setAdapter(SocialMidiaFactory.criarTwitter(tfId.getText(), tfPws.getText()));
        });
    }
}
