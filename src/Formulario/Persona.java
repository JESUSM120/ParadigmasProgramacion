/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formulario;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private int salario;
    private double coeficiente;

    public Persona(int id, String nombre, String apellido, int anioNacimiento, int salario, double coeficiente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
        this.salario = salario;
        this.coeficiente = coeficiente;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getSalario() {
        return salario;
    }

    public double getCoeficiente() {
        return coeficiente;
    }
}
