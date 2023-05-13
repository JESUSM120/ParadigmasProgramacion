package Agrupacion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        List<Muertos> listaMuertos = new ArrayList<>();
        try {
            // Abrir el archivo
            File archivoLectura = new File("muertes_everest.txt");
            Scanner leerArchivo = new Scanner(archivoLectura);
            // Leer el archivos
            while (leerArchivo.hasNext()) {
                String linea = leerArchivo.nextLine();
                String[] valores = linea.split("\\|"); //Dividir por |
                String nombre = valores[0];
                String fecha = valores[1];
                double edad = Double.parseDouble(valores[2]);
                String expedicion = valores[3];
                String nacionalidad = valores[4];
                String causa = valores[5];
                String ubicacion = valores[6];
                Muertos muertos = new Muertos(nombre, fecha, edad, expedicion, nacionalidad, causa, ubicacion);
                listaMuertos.add(muertos);
            }// Cerrar el archivo
            leerArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Agregar menu.
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("********** LISTA DE MUERTES EVEREST **********");
            System.out.println("1. MOSTRAR TODOS LOS DATOS.");
            System.out.println("2. AGRUPAR POR NACIONALIDAD");
            System.out.println("3. AGRUPAR POR CAUSA DE MUERTE");
            System.out.println("4. AGRUPAR POR UBICACION");
            System.out.println("5. SALIR");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Acción para la opción 1
                    System.out.println("LISTA DE MUERTES EVEREST");
                    imprimirEncabezado();
                    listaMuertos.stream()
                            .forEach(System.out::println);
                    imprimirRenglon();
                    break;
                case 2:
                    // Acción para la opción 2
                    System.out.println("LISTA DE MUERTES EVEREST");
                    Map<String, List<Muertos>> mapaPorNacionalidad = listaMuertos.stream()
                            .collect(Collectors.groupingBy(Muertos::getNacionalidad));

                    // Iterar sobre el mapa e imprimir los resultados
                    mapaPorNacionalidad.forEach((nacionalidad, listaNacionalidad) -> {
                        // Imprimir la nacionalidad
                        System.out.printf("Nacionalidad: %s\n", nacionalidad);

                        // Imprimir los muertos correspondientes a esa nacionalidad
                        imprimirEncabezado();
                        listaNacionalidad.forEach(System.out::println);
                        imprimirRenglon();
                    });
                    break;

                case 3:
                    // Acción para la opción 3
                    System.out.println("LISTA DE MUERTES EVEREST");
                    Map<String, List<Muertos>> muertosPorCausa = listaMuertos.stream()
                            .collect(Collectors.groupingBy(Muertos::getCausa));
                    muertosPorCausa.forEach((causa, muertos) -> {
                        System.out.println("Causa de muerte: " + causa);
                        imprimirEncabezado();
                        muertos.forEach(System.out::println);
                        imprimirRenglon();
                    });
                    break;
                case 4:
                    System.out.println("LISTA DE MUERTES EVEREST");
                    System.out.println("LISTA DE MUERTES EVEREST AGRUPADAS POR UBICACIÓN");
                    Map<String, List<Muertos>> muertosPorUbicacion = listaMuertos.stream()
                            .collect(Collectors.groupingBy(Muertos::getUbicacion));
                    muertosPorUbicacion.forEach((ubicacion, muertos) -> {
                        System.out.println(ubicacion);
                        imprimirEncabezado();
                        muertos.forEach(System.out::println);
                        imprimirRenglon();
                    });
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%-30s %-15s %-10s %-45s %-20s %-35s\n", "Nombre", "Fecha", "Edad", "Expedicion",
                "Nacionalidad", "Causa", "Ubicacion");
        System.out.println("----------------------------------------------------");
    }
}
