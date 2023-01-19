package k_JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Quando é nulo ele centraliza na tela do computador

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        botao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu!!!");
            }
        });

        janela.setVisible(true);

    }
}
