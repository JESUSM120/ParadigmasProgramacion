/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecucion_Hilos;

public class Runner1 implements  Runnable{
        @Override
        public void run(){
            for (int i = 0; i < 1000; ++i)
                System.out.println("Runner1: " + i);
        }
}
class Runner2 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 1000; ++i)
            System.out.println("\t\tRunner2:  "+ i);
    }
}
