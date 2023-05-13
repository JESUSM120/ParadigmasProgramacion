package MemoPad;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;

public class MemoPad extends JFrame {

    private JTextArea textArea;
    private final String fileName = "autosave.txt";
    private final ArrayList<String> dictionary = new ArrayList<>();

    public MemoPad() {
        super("AutoSave");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loadDictionary();
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        new AutoSaveThread().start();
        new SpellCheckThread().start();
        setVisible(true);
        loadSavedText();
    }

    private void loadDictionary() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dict.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                dictionary.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error loading dictionary: " + e.getMessage());
        }
    }

    private void loadSavedText() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            reader.close();
            textArea.setText(sb.toString());
        } catch (IOException e) {
            System.err.println("Error loading saved text: " + e.getMessage());
        }
    }

    private void saveText() {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(textArea.getText());
            writer.close();
            System.out.println("Changes Save");
        } catch (IOException e) {
            System.err.println("Error saving text: " + e.getMessage());
        }
    }

    private boolean checkSpelling() {
        Pattern p = Pattern.compile("\\b\\w+\\b"); // match word characters
        String text = textArea.getText();
        Matcher m = p.matcher(text);

        boolean hasErrors = false;
        while (m.find()) {
            String word = m.group().toLowerCase();
            if (!dictionary.contains(word)) {
                // exclude words with special characters
                if (!word.matches("[\\w']+")) {
                    continue;
                }

                int start = m.start();
                int end = m.end();
                try {
                    textArea.getHighlighter().addHighlight(start, end, new DefaultHighlighter.DefaultHighlightPainter(Color.RED));
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
                hasErrors = true;
            }
        }
        return hasErrors;
    }

    private class AutoSaveThread extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5000);
                    saveText();
                } catch (InterruptedException e) {
                    System.err.println("AutoSaveThread interrupted: " + e.getMessage());
                }
            }
        }
    }

    private class SpellCheckThread extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(60000);
                    boolean spellingError = !checkSpelling();
                    if (spellingError) {
                        textArea.setBackground(Color.RED);
                    } else {
                        textArea.setBackground(Color.WHITE);
                    }
                } catch (InterruptedException e) {
                    System.err.println("SpellCheckThread interrupted: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        new MemoPad();
    }
}
