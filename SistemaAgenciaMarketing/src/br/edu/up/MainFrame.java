package br.edu.up;

import br.edu.up.API.absAPI;
import br.edu.up.factory.SocialMidiaFactory;
import br.edu.up.payloader.plTwitter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainFrame extends JFrame{
    private JPanel mainFrame;
    private JButton postarButton;
    private JTextField tfTituloPostagem;
    private JTextField tfTextoPostagem;
    private JComboBox comboBox1;
    private JPanel Botoes;
    private JPanel Titulo;
    private JPanel Textos;
    private JPanel pnTextoPostagem;
    private JPanel pnTituloPostagem;
    private JLabel lbTextoPostagem;
    private JLabel lbTituloPostagem;

    private GerenciadorMidiaSocial gerenciador;

    public MainFrame(String title, GerenciadorMidiaSocial gerenciador) throws HeadlessException {
        super(title);

        this.gerenciador = gerenciador;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainFrame);
        this.pack();

        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //verificando apenas quando o item é selecionado
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem = e.getItem().toString();

                    switch (selectedItem) {
                        case "Instagram":
                            gerenciador.setAdapter(SocialMidiaFactory.criarInstagram(""));
                            break;
                        case "LinkedIn":
                            gerenciador.setAdapter(SocialMidiaFactory.criarLinkedIn(""));
                            break;
                        case "Twitter":
                            gerenciador.setAdapter(SocialMidiaFactory.criarTwitter(new plTwitter("","")));
                            break;
                        case "TikTok":
                            gerenciador.setAdapter(SocialMidiaFactory.criarTikTok(""));
                            break;
                    }
                }
            }
        });
        postarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerenciador.enviar();
            }
        });
    }
}
