package Agrupacion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicadosMuertos {

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

        //Se crea un menu.
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Lista de muertos del Everest ===");
            System.out.println("1. Nombre y la nacionalidad de las personas que pertenecian"
                    + "a 'United Kingdom'");
            System.out.println("2. Nombre y edad de las personas que tengan entre 18 y 21 años");
            System.out.println("3. Nombre y Edad de las personas que no sean menores a los 50 años");
            System.out.println("4. Nombre, edad y nacionalidad de las personas que tengan 25 años o que "
                    + "sean de nacionalidad Mexicana");
            System.out.println("5. Ingreso de una letra, para mostrar el nombre y la causa de muerte");
            System.out.println("6. Nombre y causa de muertes en orden ascente segun la causa de muerte");
            System.out.println("7. Salir");

            System.out.print("Ingrese su selección: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Personas que pertenecian a 'United Kingdom'");
                    Predicate<Muertos> PersonasUnitedKingdom = muertos -> muertos.getNacionalidad().equals("United Kingdom");
                    listaMuertos.parallelStream()
                            .filter(PersonasUnitedKingdom)
                            .map(muertos -> muertos.getNombre() + ", " + muertos.getNacionalidad())
                            .forEach(System.out::println);

                    break;
                case 2:
                    System.out.println("Personas que tenia entre 18 y 21 años de edad.");
                    Predicate<Muertos> PEntre21y18 = muertos -> muertos.getEdad() >= 18 && muertos.getEdad() <= 21;
                    listaMuertos.parallelStream()
                            .filter(PEntre21y18)
                            .map(muertos -> muertos.getNombre() + ", " + muertos.getEdad())
                            .forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Personas que no son menores a los 50 años");
                    Predicate<Muertos> menores50Años = muertos -> muertos.getEdad() < 50;
                    //Se realiza la negacion
                    Predicate<Muertos> edadNoMenor50Años = menores50Años.negate();
                    listaMuertos.parallelStream()
                            .filter(edadNoMenor50Años)
                            .map(m -> m.getNombre() + ", " + m.getEdad())
                            .forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Personas que tienen 25 años o que sean de nacionalidad Mexicana");
                    Predicate<Muertos> edad25 = e -> e.getEdad() == 25;
                    Predicate<Muertos> nacionalidadMexicana = n -> n.getNacionalidad().equals("Mexican");
                    listaMuertos.parallelStream()
                            .filter(edad25.or(nacionalidadMexicana))
                            .map(m -> m.getNombre() + ", " + m.getEdad() + ", " + m.getNacionalidad())
                            .forEach(System.out::println);
                    break;
                case 5:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Ingrese una letra: ");
                    String letra = scanner1.nextLine();
                    Predicate<Muertos> conLetra = m -> m.getNombre().startsWith(letra);
                    listaMuertos.parallelStream()
                            .filter(conLetra)
                            .map(m -> m.getNombre() + ", " + m.getCausa())
                            .forEach(System.out::println);
                    break;
                case 6:
                    Predicate<Muertos> todos = muertos -> true;
                    Predicate<Muertos> muertos50 = muertos -> muertos.getEdad() >= 50;

                    Predicate<Muertos> predicado = muertos50.negate().and(todos);

                    listaMuertos.stream()
                            .filter(predicado)
                            .sorted(Comparator.comparing(Muertos::getCausa))
                            .map(muertos -> muertos.getNombre() + ", " + muertos.getCausa())
                            .forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.................");
                    break;
                default:
                    System.out.println("Selección inválida. Por favor, intente de nuevo.");
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }
}
