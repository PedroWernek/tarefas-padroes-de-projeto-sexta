package br.edu.up.view;

import br.edu.up.GerenciadorMidiaSocial;
import br.edu.up.images.CaixaDeFerramentas;
import br.edu.up.view.components.FabricPayload;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class MainFrame extends JFrame{

    private JPanel mainFrame;
    private JButton btnCriarPostagem;
    private JComboBox<String> comboBox1;
    private JPanel plPainel;
    private String selectedItem = "Instagram";


    public MainFrame(String title, GerenciadorMidiaSocial gerenciador) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainFrame);
        this.pack();
        CaixaDeFerramentas.deixarTelaNoCentro(this);

        comboBox1.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                this.selectedItem = e.getItem().toString();
                atualizarPainelPayload(gerenciador);
            }
        });
        //iniciando com o instagram selecionado
        comboBox1.setSelectedItem("Instagram");
        atualizarPainelPayload(gerenciador);

        btnCriarPostagem.addActionListener(e -> {
            TelaDePublicacao telaDePublicacao = new TelaDePublicacao(selectedItem,gerenciador);
            telaDePublicacao.setVisible(true);
        });
    }
        private void atualizarPainelPayload(GerenciadorMidiaSocial gerenciador) {
            plPainel.removeAll();

            plPainel.setLayout(new FlowLayout(FlowLayout.LEFT));
            switch (selectedItem) {
                case "Instagram":
                    CaixaDeFerramentas.encontrarRedmencionarImagem(plPainel, "src/br/edu/up/images/Instagram.png");
                    FabricPayload.plComponentIntagram(plPainel, gerenciador);
                    break;
                case "LinkedIn":
                    CaixaDeFerramentas.encontrarRedmencionarImagem(plPainel, "src/br/edu/up/images/LinkedIn.png");
                    FabricPayload.plComponentLinkedIn(plPainel, gerenciador);
                    break;
                case "Twitter":
                    CaixaDeFerramentas.encontrarRedmencionarImagem(plPainel, "src/br/edu/up/images/Twitter.png");
                    FabricPayload.plComponentTwitter(plPainel, gerenciador);
                    break;
                case "TikTok":
                    CaixaDeFerramentas.encontrarRedmencionarImagem(plPainel, "src/br/edu/up/images/TikTok.png");
                    FabricPayload.plComponentTiktok(plPainel, gerenciador);
                    break;
            }
            plPainel.revalidate();
            plPainel.repaint();
        }

}
