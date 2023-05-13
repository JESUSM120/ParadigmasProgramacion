package Hilos;

/**
 *
 * @author Jesus Maldonado Cruz
 */
public class Articulo implements Runnable{
    @Override
    public void run(){
        ArticuloMinorista a1 = new ArticuloMinorista("Chaqueta", 12, 59.95);
        ArticuloMinorista a2 = new ArticuloMinorista("Jeans de diseñador", 40, 39.95);
        ArticuloMinorista a3 = new ArticuloMinorista("Camisa", 20, 24.95);
        
        System.out.println("Articulo 1: " +a1.getDescripcion() + " , Unidades: "+a1.getUnidadesDisponibles()+
                " , Precio: "+a1.getPrecio());
        System.out.println("Articulo 1: " +a2.getDescripcion() + " , Unidades: "+a2.getUnidadesDisponibles()+
                " , Precio: "+a2.getPrecio());
        System.out.println("Articulo 1: " +a3.getDescripcion() + " , Unidades: "+a3.getUnidadesDisponibles()+
                " , Precio: "+a3.getPrecio());
    }
    public static void main(String[] args) {
        Articulo articulos = new Articulo();
        Thread hilo = new Thread(articulos);
        hilo.start();
    }
}
