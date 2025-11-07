package br.edu.up.view.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CaixaDeFerramentas {

    public static void encontrarRedmencionarImagem(JPanel plPainel, String path){

        JLabel picImage;
        try {
            BufferedImage iconeRede = ImageIO.read(new File(path));
            Image imagemRedimensionada = iconeRede.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            picImage = new JLabel(new ImageIcon(imagemRedimensionada));

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

        plPainel.add(picImage);
    }
    public static void deixarTelaNoCentro(JFrame frame) {
        // Get the screen size as a java dimension
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the frame location
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;

        // Set the location of the frame
        frame.setLocation(x, y);
    }

    public static void caixaDeAviso(String titulo, String texto) {
        JFrame caixa = new JFrame();

        JOptionPane.showMessageDialog(caixa,
                        texto,
                        titulo,
                        JOptionPane.INFORMATION_MESSAGE);
    }
}
