/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatBueno;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ChatThreadExample {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        // Crear instancias de los hilos
        Thread megmThread = new MegmThread(lock);
        Thread kathyoThread = new KathyoThread(lock);

        // Iniciar los hilos
        kathyoThread.start();
        megmThread.start();
    }
}

// Clase para el hilo de Megm
class MegmThread extends Thread {

    private final Lock lock;

    public MegmThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        escribirMensaje("Megm: Hi, there!");

        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Megm: What are you doing?");

        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Megm: What are you working on?");

        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Megm: I'm in a cafe with my friend Carmen"
                + ".I'm having coffe, and she's talking on the phone outside.How is your family?");
        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Megm: Where' s your brother ?");
        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Megm: OK! Bye!");
    }

    private void escribirMensaje(String mensaje) {
        lock.lock();
        try {
            for (char c : mensaje.toCharArray()) {
                System.out.print(c);
                try {
                    // Esperar un breve intervalo para simular la escritura en tiempo real
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        } finally {
            lock.unlock();
        }
    }
}

// Clase para el hilo de Kathyo
class KathyoThread extends Thread {

    private final Lock lock;

    public KathyoThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            // Esperar a que el hilo de Megm imprima su primer mensaje
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Kathyo: Hi, Meg!");

        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Kathyo: I'm sitting on my bed with my laptop. I'm doing my homework.");

        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Kathyo: I'm writing an essay for Spanish class. :) Where are you?");

        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Kathyo: They're all fine! My father's watching a baseball game with his friends. My mother is out shopping.");

        try {
            // Esperar 2 segundos antes de la siguiente respuesta
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        escribirMensaje("Kathyo: John's playing soccer in the park. Oh, wait. My phone is ringing. My mother's calling me. I have to go! Bye!");
    }

    private void escribirMensaje(String mensaje) {
        lock.lock();
        try {
            for (char c : mensaje.toCharArray()) {
                System.out.print(c);
                try {
                    // Esperar un breve intervalo para simular la escritura en tiempo real
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        } finally {
            lock.unlock();
        }
    }
}
