package br.edu.up.view;

import br.edu.up.GerenciadorMidiaSocial;
import br.edu.up.factory.SocialMidiaFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class MainFrame extends JFrame{

    private JPanel mainFrame;
    private JButton postarButton;
    private JComboBox<String> comboBox1;

    public MainFrame(String title, GerenciadorMidiaSocial gerenciador) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainFrame);
        this.pack();

        comboBox1.addItemListener(e -> {
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
                        gerenciador.setAdapter(SocialMidiaFactory.criarTwitter("",""));
                        break;
                    case "TikTok":
                        gerenciador.setAdapter(SocialMidiaFactory.criarTikTok(""));
                        break;
                }
            }
        });
        postarButton.addActionListener(e ->
            gerenciador.enviar()
        );
    }
}
