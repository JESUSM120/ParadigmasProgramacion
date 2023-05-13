/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

public class EscrituraLenta {
    public static void  escribir (String palabra, int velocidad) {
        char[] caracteres = palabra.toCharArray();
        for (int i =0; i< caracteres.length; i++){
            System.out.print(caracteres[i]);
            try {
                Thread.sleep(velocidad);
            }
            catch (Exception e){
                System.out.println();
            }
        }
    }
}
