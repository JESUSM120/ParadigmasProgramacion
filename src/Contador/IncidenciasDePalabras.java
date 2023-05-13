package Contador;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class IncidenciasDePalabras extends JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Map<String, Integer> frecuencias = new HashMap<>();

    //Se declara el constructor del formulario.
    public IncidenciasDePalabras() {
        initComponents();
        crearMapa();
        llenarTabla();
    }

    private void crearMapa() {
        File file = new File("03.1 melville-moby_dick.txt");

        // Crear un objeto de tipo Scanner para leer el contenido del archivo
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            return;
        }

        // Recorrer el archivo línea por línea y para cada línea, dividirla en palabras utilizando un StringTokenizer
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(linea, " ");
            while (tokenizer.hasMoreTokens()) {
                String palabra = tokenizer.nextToken().toLowerCase();

                // Verificar si la palabra es válida (no contiene signos de puntuación u otros caracteres no deseados)
                if (palabra.matches("[a-zA-Z]+")) {
                    // Actualizar la incidencia de la palabra
                    if (frecuencias.containsKey(palabra)) {
                        frecuencias.put(palabra, frecuencias.get(palabra) + 1);
                    } else {
                        frecuencias.put(palabra, 1);
                    }
                }
            }
        }
    }

    private void llenarTabla() {
        Set<String> claves = frecuencias.keySet();
        //ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        for (String clave : clavesOrdenadas) {
            String[] fila = {clave, String.valueOf(frecuencias.get(clave))};
            model.addRow(fila);
        }
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout());
        //Crear una tabla
        JTable table = new JTable(model);
        model.addColumn("Palabra");
        model.addColumn("No. de ocurrencias");

        // Agregar el scroll a la tabla
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Ajustar el tamaño de las columnas de la tabla
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        panel.add(table.getTableHeader(), BorderLayout.NORTH);

        setContentPane(panel);
        //Caracteristicas de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);

        setTitle("Frecuencia de palabras de un archivo de texto");
        setLocationRelativeTo(null);
    }

    //Se decllara el metodo main para ejecurar el formulario
    public static void main(String[] args) {
        new IncidenciasDePalabras().setVisible(true);
    }
}
