/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videojuegos;

public class VideoJuegos {
    private int indice;
    private String titulo;
    private String plataforma;
    private int año;
    private String genero;
    private String publisher;
    private double Ventas_NA;
    private double Ventas_EU;
    private double Ventas_JP;
    private double Ventas_Globales;

    public VideoJuegos(int indice, String titulo, String plataforma, int año, String genero, String publisher, 
            double Ventas_NA, double Ventas_EU, double Ventas_JP, double Ventas_Globales) {
        this.indice = indice;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.año = año;
        this.genero = genero;
        this.publisher = publisher;
        this.Ventas_NA = Ventas_NA;
        this.Ventas_EU = Ventas_EU;
        this.Ventas_JP = Ventas_JP;
        this.Ventas_Globales = Ventas_Globales;
    }

    public int getIndice() {
        return indice;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getAño() {
        return año;
    }

    public String getGenero() {
        return genero;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getVentas_NA() {
        return Ventas_NA;
    }

    public double getVentas_EU() {
        return Ventas_EU;
    }

    public double getVentas_JP() {
        return Ventas_JP;
    }

    public double getVentas_Globales() {
        return Ventas_Globales;
    }

    boolean formatoArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
