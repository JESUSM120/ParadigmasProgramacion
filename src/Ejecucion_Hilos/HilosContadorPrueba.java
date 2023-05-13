/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecucion_Hilos;

public class HilosContadorPrueba {
    public static void main(String[] args) {
        Thread cuentaAtras = new Thread(new ContadorAtras("Contador--"));
        cuentaAtras.start();

        Thread cuentaAdelante = new Thread(new ContadorAdelante("Contador++"));
        cuentaAdelante.start();
    }
}
