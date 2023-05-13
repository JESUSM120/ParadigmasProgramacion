package Videojuegos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GenerarArchivo {
    private String nombreArchivo;

    public GenerarArchivo(String nombreA) {
        this.nombreArchivo = nombreA;
    }

    public void crearArchivo() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
                System.out.println("El archivo" + nombreArchivo + " se ha creado");
                salidaArchivo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirEnArchivo(ArrayList<VideoJuegos> listaVideoJuegos) {
        try {
            PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
            for (VideoJuegos games : listaVideoJuegos) {
                salidaArchivo.println(games.formatoArchivo());
            }
            salidaArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//FIN DE ESCRIBIR EN ARCHIVO

    public ArrayList<VideoJuegos> leerDeArchivo() {
        ArrayList<VideoJuegos> listaVideoJuegos = new ArrayList<>();
        try {
            // Abrir el archivo
            File archivoLectura = new File(nombreArchivo);
            Scanner leerArchivo = new Scanner(archivoLectura);
            // Leer el archivo
            while (leerArchivo.hasNext()) {
                String linea = leerArchivo.nextLine();
                String[] valores = linea.split("\\|"); //Dividir por |
                int indice = Integer.parseInt(valores[0]);
                String titulo = valores[1];
                String plataforma = valores[2];
                int año = Integer.parseInt(valores[3]);
                String genero = valores[4];
                String publisher = valores[5];
                double Ventas_NA = Double.parseDouble(valores[6]);
                double Ventas_EU = Double.parseDouble(valores[7]);
                double Ventas_JP = Double.parseDouble(valores[8]);
                double Ventas_Globales = Double.parseDouble(valores[9]);
                
                VideoJuegos lisJuegos = new VideoJuegos(indice, titulo, plataforma, año, genero, publisher, Ventas_NA, Ventas_EU, Ventas_JP, Ventas_Globales);
                listaVideoJuegos.add(lisJuegos);

            }// Cerrar el archivo
            leerArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaVideoJuegos;
    } // fin de leerDeArchivo
}
