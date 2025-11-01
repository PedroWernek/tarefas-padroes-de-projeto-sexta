package br.edu.up;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {

    private final Font mainFont = new Font("Calibri", Font.BOLD, 18);
    JTextField tfFistName, tfLastName;
    JLabel lbWelcome;

    public void iniciar() {

        /**
         * *************FORM PAINEL****************
         */
        JLabel lbFirstName = new JLabel("first Name");
        lbFirstName.setFont(mainFont);

        tfFistName = new JTextField();
        tfFistName.setFont(mainFont);

        JLabel lbLastName = new JLabel("first Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFistName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);
        /**
         * *************Welcome Label****************
         */
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /**
         * *************Buttons Panel****************
         */
        JButton bntOK = new JButton("OK");
        bntOK.setFont(mainFont);
        bntOK.addActionListener((ActionEvent e) -> {
            String firstName = tfFistName.getText();
            String lastName = tfLastName.getText();
            lbWelcome.setText("Hello" + firstName + " " + lastName);
        });

        JButton bntClear = new JButton("Clear");
        bntClear.setFont(mainFont);
        bntClear.addActionListener((ActionEvent e) -> {
            tfFistName.setText("");
            tfLastName.setText("");
            lbWelcome.setText("");
        });
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(bntOK);
        buttonsPanel.add(bntClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
