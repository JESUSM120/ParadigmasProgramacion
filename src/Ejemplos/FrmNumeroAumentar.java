/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import javax.swing.*;
import java.awt.*;

public class FrmNumeroAumentar extends JFrame implements Runnable {
    private JTextField txtNumero;
    public FrmNumeroAumentar(){
        super("Numero en aumento");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);
        txtNumero = new JTextField(20);
        add(txtNumero);
        Thread cargarDatos = new Thread(this);
        cargarDatos.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            //el hilo se duerme
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // hilo despierto
            i++;
            txtNumero.setText("Mensaje "+ i);
        }
    }

    public static void main(String[] args) {
        FrmNumeroAumentar window = new FrmNumeroAumentar();
        window.setVisible(true);
    }
}
