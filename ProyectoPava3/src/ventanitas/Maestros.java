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

    private String plaza;

    public Maestros() {
    }

    public Maestros(String plaza, String nombre, String apPaterno, String apMaterno, int edad) {
        super(nombre, apPaterno, apMaterno, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    

}
