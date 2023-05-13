/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecucion_Hilos;

public class ContadorAtras implements  Runnable{
    private String nombre;

    public ContadorAtras(String nombrex){
        this.nombre = nombrex;
    }

    @Override
    public void run() {
        for (int i = 1000; i >=1; i--){
            System.out.println("\t\t\t" + nombre + " " + i + "\n");
        }
        System.out.println();
    }
}
