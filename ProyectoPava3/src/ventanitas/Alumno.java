/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanitas;

/**
 *
 * @author ALUMNO
 */
public class Alumno extends Personas {

    private String matricula;

    public Alumno() {
    }
    
    public Alumno(String matricula, String nombre, String apPaterno, String apMaterno, int edad) {
        super(nombre, apPaterno, apMaterno, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

}
