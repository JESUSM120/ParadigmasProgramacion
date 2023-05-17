package Chat;

import java.util.Scanner;

public class ChatThreadExample {
    public static void main(String[] args) {
        // Crear instancias de los hilos
        Thread usuarioThread = new UsuarioThread();
        Thread chatbotThread = new ChatbotThread();

        // Iniciar los hilos
        usuarioThread.start();
        chatbotThread.start();
    }
}

// Clase para el hilo del usuario
class UsuarioThread extends Thread {
    @Override
    public void run() {
        try {
            // Esperar 1 segundo para simular la entrada del usuario
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String mensaje = scanner.nextLine();
        // Procesar el mensaje del usuario
        // Aquí puedes agregar la lógica para procesar la entrada del usuario
        System.out.println("Procesando mensaje del usuario: " + mensaje);
    }
}

// Clase para el hilo del chatbot
class ChatbotThread extends Thread {
    @Override
    public void run() {
        System.out.println("Bienvenido al chat. ¡Puedes comenzar a chatear!");

        while (true) {
            // Procesar la respuesta del chatbot
            // Aquí puedes agregar la lógica para generar la respuesta del chatbot
            String respuesta = "Respuesta del chatbot";
            System.out.println("Chatbot: " + respuesta);

            try {
                // Esperar 1 segundo antes de generar la siguiente respuesta
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

