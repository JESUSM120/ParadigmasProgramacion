/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

public class PruebaHiloSleep {
    public static void main (String[] args){
        Thread h1 = new Thread(new Runner());
        h1.start();
    }
}
