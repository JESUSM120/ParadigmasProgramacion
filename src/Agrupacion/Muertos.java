
package Agrupacion;


public class Muertos {
    private String nombre;
    private String fecha;
    private double edad;
    private String expedicion;
    private String nacionalidad;
    private String causa;
    private String ubicacion;

    public Muertos(String nombre, String fecha, double edad, String expedicion, String nacionalidad, String causa, String ubicacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.edad = edad;
        this.expedicion = expedicion;
        this.nacionalidad = nacionalidad;
        this.causa = causa;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public double getEdad() {
        return edad;
    }

    public String getExpedicion() {
        return expedicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getCausa() {
        return causa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

   
    @Override
    public String toString() {
        return String.format("%-30s %-15s %-10.2f %-45s %-20s %-35s\n", nombre,
                fecha, edad, expedicion,nacionalidad, causa, ubicacion);
    }   
}
