/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecucion_Normal;

public class Runner1 {
    public void starRunning() {
        for (int i = 0; i < 10; ++i)
            System.out.println("Runner1:" + i);
    }
}
class Runner2 {
    public void starRunning() {
        for (int i = 0; i < 10; ++i) ;
        System.out.println("Runner2:" + 1);
    }
}
