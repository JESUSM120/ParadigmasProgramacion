/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecucion_Hilos;

public class ContadorAdelante implements Runnable{
    private String nombre;

    public ContadorAdelante(String nombrex){
        this.nombre = nombrex;
    }
    @Override
    public void run(){
        for (int i = 1; i<= 1000; i++){
            System.out.println("\t" + nombre + " " + i + "\n");
        }
        System.out.println();
    }
}
