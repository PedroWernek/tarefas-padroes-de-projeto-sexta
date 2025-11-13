package br.edu.up.view;

import br.edu.up.GerenciadorMidiaSocial;
import br.edu.up.data.Publicacao;
import br.edu.up.data.rede.ConteudoInstagram;
import br.edu.up.data.rede.ConteudoLinkedIn;
import br.edu.up.data.rede.ConteudoTiktok;
import br.edu.up.data.rede.ConteudoTwitter;
import br.edu.up.view.components.CaixaDeFerramentas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelaDePublicacao extends JFrame{
    private JPanel telaPublicacao;
    private JButton btnCancelar;
    private JButton btnPublicar;
    private JPanel pnCompPostagem;
    private JPanel btnPostagem;
    private JLabel lbCriadorPostagem;
    private final Publicacao publicacao = new Publicacao();

    public TelaDePublicacao(String selectedItem, GerenciadorMidiaSocial gerenciadorMidiaSocial) throws HeadlessException {
        super(selectedItem);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(telaPublicacao);
        this.pack();
        CaixaDeFerramentas.deixarTelaNoCentro(this);
        pnCompPostagem.setLayout(new GridLayout(4, 2, 5, 5));

        switch (selectedItem) {
            case "Instagram":
                criarCaixaInstagram(gerenciadorMidiaSocial);
                break;
            case "LinkedIn":
                criarCaixaLinkedIn(gerenciadorMidiaSocial);;
                break;
            case "Twitter":
                criarCaixaTwitter(gerenciadorMidiaSocial);
                break;
            case "TikTok":
                criarCaixaTiktok(gerenciadorMidiaSocial);
                break;
        }

        pnCompPostagem.revalidate();
        pnCompPostagem.repaint();

        btnCancelar.addActionListener(c -> {
            this.dispose();
        });

    }

    private void criarCaixaInstagram(GerenciadorMidiaSocial gerenciadorMidiaSocial){

        JLabel lbSubtitulo = new JLabel("Subtitulo:");
        JTextField tfSubtitulo = new JTextField();

        JLabel lbVideo = new JLabel("Video:");
        JTextField tfVideo = new JTextField();

        JLabel lbHashtags = new JLabel("Hashtags - separe por virgula:");
        JTextField tfHashtags = new JTextField();

        pnCompPostagem.add(lbSubtitulo);
        pnCompPostagem.add(tfSubtitulo);
        pnCompPostagem.add(lbVideo);
        pnCompPostagem.add(tfVideo);
        pnCompPostagem.add(lbHashtags);
        pnCompPostagem.add(tfHashtags);

        btnPublicar.addActionListener(p -> {
            String[] tfText = tfHashtags.getText().split(",");
            List<String> hashtags = new ArrayList<>(Arrays.asList(tfText));
        if(!tfVideo.getText().isEmpty() || !tfSubtitulo.getText().isEmpty() ) {
            publicacao.conteudo = new ConteudoInstagram(tfSubtitulo.getText(), tfVideo.getText(),hashtags);
            postar(gerenciadorMidiaSocial);
        }else{
            CaixaDeFerramentas.caixaDeAviso("Aviso!","Video ou subtitulo  vazio!");
        }
        });

    }
    private void criarCaixaLinkedIn(GerenciadorMidiaSocial gerenciadorMidiaSocial){

        JLabel lbTextoVaga = new JLabel("Texto Vaga");
        JTextField tfTextoVaga = new JTextField();

        JLabel lbCompetencias = new JLabel("Competencias - separe por virgula");
        JTextField tfCompetencias = new JTextField();

        pnCompPostagem.add(lbTextoVaga);
        pnCompPostagem.add(tfTextoVaga);
        pnCompPostagem.add(lbCompetencias);
        pnCompPostagem.add(tfCompetencias);

        btnPublicar.addActionListener(p -> {
            String[] tfText = tfCompetencias.getText().split(",");
            List<String> competencias = new ArrayList<>(Arrays.asList(tfText));
            if(!tfTextoVaga.getText().isEmpty()) {
                publicacao.conteudo = new ConteudoLinkedIn(tfTextoVaga.getText(), competencias);
                postar(gerenciadorMidiaSocial);
            }else{
                CaixaDeFerramentas.caixaDeAviso("Aviso!","texto da vaga vazio!");
            }
            });

    }
    private void criarCaixaTiktok(GerenciadorMidiaSocial gerenciadorMidiaSocial){

        JLabel lbSubtitulo = new JLabel("Subtitulo");
        JTextField tfSubtitulo = new JTextField();

        JLabel lbVideo = new JLabel("Video");
        JTextField tfVideo = new JTextField();

        JLabel lbHashtags = new JLabel("Hashtags - separe por virgula");
        JTextField tfHashtags = new JTextField();

        pnCompPostagem.add(lbVideo);
        pnCompPostagem.add(tfVideo);
        pnCompPostagem.add(lbSubtitulo);
        pnCompPostagem.add(tfSubtitulo);
        pnCompPostagem.add(lbHashtags);
        pnCompPostagem.add(tfHashtags);

        btnPublicar.addActionListener(p -> {
            String[] tfText = tfHashtags.getText().split(",");
            List<String> hashtags = new ArrayList<>(Arrays.asList(tfText));
            if(!tfVideo.getText().isEmpty() || !tfSubtitulo.getText().isEmpty()) {
            publicacao.conteudo = new ConteudoTiktok(tfVideo.getText(), tfSubtitulo.getText(),hashtags);
            postar(gerenciadorMidiaSocial);
        }else{
            CaixaDeFerramentas.caixaDeAviso("Aviso!","Video ou subtitulo vazio!");
        }
        });

    }
    private void criarCaixaTwitter(GerenciadorMidiaSocial gerenciadorMidiaSocial){

        JLabel lbTexto = new JLabel("Texto");
        JTextField tfTexto = new JTextField();

        JLabel lbImagem = new JLabel("Imagem");
        JTextField tfImagem = new JTextField();

        pnCompPostagem.add(lbTexto);
        pnCompPostagem.add(tfTexto);
        pnCompPostagem.add(lbImagem);
        pnCompPostagem.add(tfImagem);

        btnPublicar.addActionListener(p -> {
            if(!tfTexto.getText().isEmpty()) {
            publicacao.conteudo = new ConteudoTwitter(tfTexto.getText(), tfImagem.getText());
            postar(gerenciadorMidiaSocial);
            }else{
                CaixaDeFerramentas.caixaDeAviso("Aviso!","Postagem vazia!");
            }
        });


    }

    private void postar(GerenciadorMidiaSocial gerenciadorMidiaSocial){
        gerenciadorMidiaSocial.setPublicacao(publicacao);
        gerenciadorMidiaSocial.enviar();
    }
}
