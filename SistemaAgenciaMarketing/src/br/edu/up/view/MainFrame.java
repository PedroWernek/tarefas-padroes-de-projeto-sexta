package br.edu.up.view;

import br.edu.up.GerenciadorMidiaSocial;
import br.edu.up.factory.SocialMidiaFactory;
import br.edu.up.view.components.FabricPayload;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class MainFrame extends JFrame{

    private JPanel mainFrame;
    private JButton postarButton;
    private JComboBox<String> comboBox1;
    private JPanel plPainel;

    public MainFrame(String title, GerenciadorMidiaSocial gerenciador) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainFrame);
        this.pack();

        comboBox1.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedItem = e.getItem().toString();
                atualizarPainelPayload(selectedItem,gerenciador);
            }
        });
        //iniciando com o instagram selecionado
        comboBox1.setSelectedItem("Instagram");
        atualizarPainelPayload("Instagram", gerenciador);

    }
        private void atualizarPainelPayload(String selectedItem, GerenciadorMidiaSocial gerenciador) {
        plPainel.removeAll();

        plPainel.setLayout(new FlowLayout(FlowLayout.LEFT));
                    switch (selectedItem) {
                        case "Instagram":
                            // Criar os componentes
                            FabricPayload.plComponentIntagram(plPainel, gerenciador);
                            break;
                        case "LinkedIn":
                            FabricPayload.plComponentLinkedIn(plPainel, gerenciador);
                            break;
                        case "Twitter":
                            FabricPayload.plComponentTwitter(plPainel, gerenciador);
                            break;
                        case "TikTok":
                            FabricPayload.plComponentTiktok(plPainel, gerenciador);
                            break;
                    }
                    plPainel.revalidate();
                    plPainel.repaint();
        }
}
