/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormularioHilos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HilosFormu {

    private static final String AUTO_SAVE_FILE = "autoguardado.txt";
    private static final long AUTO_SAVE_INTERVAL_MS = 5000;

    private JFrame frame;
    private JTextArea textArea;

    public static void main(String[] args) {
        HilosFormu programa = new HilosFormu();
        programa.run();
    }

    private void run() {
        createUI();
        loadTextFromFile();
        startAutoSaveTimer();
    }

    private void createUI() {
        frame = new JFrame("Programa de AutoGuardado");
        frame.setPreferredSize(new Dimension(800, 600));
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveTextToFile();
                System.exit(0);
            }
        });
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void startAutoSaveTimer() {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                saveTextToFile();
            }
        }, AUTO_SAVE_INTERVAL_MS, AUTO_SAVE_INTERVAL_MS);
    }

    private void loadTextFromFile() {
        try {
            String text = new String(Files.readAllBytes(Paths.get(AUTO_SAVE_FILE)));
            textArea.setText(text);
        } catch (IOException e) {
            // ignore if file does not exist
        }
    }

    private void saveTextToFile() {
        try {
            String text = textArea.getText();
            FileWriter writer = new FileWriter(new File(AUTO_SAVE_FILE));
            writer.write(text);
            writer.close();
            System.out.println("Cambios guardados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

