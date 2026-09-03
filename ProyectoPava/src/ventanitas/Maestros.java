/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanitas;

/**
 *
 * @author ALUMNOS
 */
public class Maestros extends Personas {

    String plaza;

    public Maestros() {

    }

    public Maestros(String plaza, String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

}

/*private String plaza, nombre, apellidoPaterno, apellidoMaterno;
    private int edad;

    public Maestros() {
    }

    public Maestros(String plaza, String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
        this.plaza = plaza;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 */
