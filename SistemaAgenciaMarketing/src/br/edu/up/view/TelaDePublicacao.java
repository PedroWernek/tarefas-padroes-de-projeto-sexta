package br.edu.up.view;

import br.edu.up.GerenciadorMidiaSocial;
import br.edu.up.images.CaixaDeFerramentas;

import javax.swing.*;
import java.awt.*;

public class TelaDePublicacao extends JFrame{
    private JPanel telaPublicacao;
    private JButton btnCancelar;
    private JButton btnPublicar;
    private JLabel lbCriadorPostagem;
    private JPanel btnPostagem;
    private JPanel pnCompPostagem;

    public TelaDePublicacao(String selectedItem, GerenciadorMidiaSocial gerenciadorMidiaSocial) throws HeadlessException {
        super(selectedItem);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(telaPublicacao);
        this.pack();
        CaixaDeFerramentas.deixarTelaNoCentro(this);
        pnCompPostagem.setLayout(new GridLayout(0, 2, 5, 5));

        switch (selectedItem) {
            case "Instagram":
                criarCaixarInstagram();
                break;
            case "LinkedIn":
                criarCaixarLinkedIn();;
                break;
            case "Twitter":
                criarCaixarTwitter();
                break;
            case "TikTok":
                criarCaixarTiktok();
                break;
        }

        pnCompPostagem.revalidate();
        pnCompPostagem.repaint();

    }

    private void criarCaixarInstagram(){

        JLabel lbSubtitulo = new JLabel("Subtitulo");
        JTextField tfSubtitulo = new JTextField();

        JLabel lbVideo = new JLabel("Video");
        JTextField tfVideo = new JTextField();
        tfVideo.setBounds(1,1,100,100);

        JLabel lbHashtags = new JLabel("Hashtags - separe por virgula");
        JTextField tfHashtags = new JTextField();

        pnCompPostagem.add(lbSubtitulo);
        pnCompPostagem.add(tfSubtitulo);
        pnCompPostagem.add(lbVideo);
        pnCompPostagem.add(tfVideo);
        pnCompPostagem.add(lbHashtags);
        pnCompPostagem.add(tfHashtags);

    }
    private void criarCaixarLinkedIn(){


        JLabel lbTextoVaga = new JLabel("Texto Vaga");
        JTextField tfTextoVaga = new JTextField();

        JLabel lbCompetencias = new JLabel("Competencias - separe por virgula");
        JTextField tfCompetencias = new JTextField();

        pnCompPostagem.add(lbTextoVaga);
        pnCompPostagem.add(tfTextoVaga);
        pnCompPostagem.add(lbCompetencias);
        pnCompPostagem.add(tfCompetencias);

    }
    private void criarCaixarTiktok(){
        pnCompPostagem.setLayout(new GridLayout(0, 2, 5, 5));

        JLabel lbSubtitulo = new JLabel("Subtitulo");
        JTextField tfSubtitulo = new JTextField();

        JLabel lbVideo = new JLabel("Video");
        JTextField tfVideo = new JTextField();
        tfVideo.setBounds(1,1,100,100);

        JLabel lbHashtags = new JLabel("Hashtags - separe por virgula");
        JTextField tfHashtags = new JTextField();

        pnCompPostagem.add(lbVideo);
        pnCompPostagem.add(tfVideo);
        pnCompPostagem.add(lbSubtitulo);
        pnCompPostagem.add(tfSubtitulo);
        pnCompPostagem.add(lbHashtags);
        pnCompPostagem.add(tfHashtags);

    }
    private void criarCaixarTwitter(){
        pnCompPostagem.setLayout(new GridLayout(0, 2, 5, 5));

        JLabel lbTexto = new JLabel("Texto");
        JTextField tfTexto = new JTextField();

        JLabel lbImagem = new JLabel("Imagem");
        JTextField tfImagem = new JTextField();
        tfImagem.setBounds(1,1,100,100);

        pnCompPostagem.add(lbTexto);
        pnCompPostagem.add(tfTexto);
        pnCompPostagem.add(lbImagem);
        pnCompPostagem.add(tfImagem);


    }
}
