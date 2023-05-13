package Contador;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class FrmConteoPalabras extends JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Map<String, Integer> frecuencias = new HashMap<>();

    //Se declara el constructor del formulario.
    public FrmConteoPalabras() {
        initComponents();
        crearMapa();
        llenarTabla();
    }

    private void crearMapa() {
        String enunciado = "mapa mapa zona";
        //divide el enunciado en tokens
        String[] tokens = enunciado.split(" ");

        //procesamiento del texto de entrada
        for (String token : tokens) {
            String palabra = token.toLowerCase();
            if (frecuencias.containsKey(palabra)) {
                int cuenta = frecuencias.get(palabra);
                frecuencias.put(palabra, cuenta + 1);
            } else {
                frecuencias.put(palabra, 1);
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
        panel.add(table.getTableHeader(), BorderLayout.NORTH);

        //Agregar el contenido de la talba al centro del contenedor
        panel.add(table, BorderLayout.CENTER);
        setContentPane(panel);
        //Caracteristicas de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);

        setTitle("Frecuencia de palabras de un archivo de texto");
        setLocationRelativeTo(null);
    }

    //Se decllara el metodo main para ejecurar el formulario
    public static void main(String[] args) {
        new FrmConteoPalabras().setVisible(true);
    }
}
