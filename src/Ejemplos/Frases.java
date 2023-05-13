/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

public class Frases {
    public static void main(String[] args) {
        String frase1 = "Preguntarse cuando los ordenadore podran pensar es como"+ "\n"+
                "preguntarse cuando los sudmarinos podran nadar . ";
        String autorfrase1 = "-- Edsger W. Dijkstra";
        String frase2 = "No importa lo estupendamente que haya ido la demo en " + "\n" +
                "Los ensayos cuando lo haces frente a tu audiencia la" + "\n" +
                "Probabilidad de que sea una presentacion exitosa es " + "\n" +
                "Inversamente proporcional al numero de personas mirando," + "\n"+
                "elevado a la cantidada de dinero que hay en un juego" + "\n" +
                "---- Mark Gibbs";
        EscrituraLenta.escribir(frase1,20);
        EscrituraLenta.escribir(autorfrase1, 400);
        System.out.println();
        EscrituraLenta.escribir("---------------------------",200);
        EscrituraLenta.escribir("",2000);
        System.out.println();
        EscrituraLenta.escribir(frase2,10);
    }
}
