/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanitas;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ALUMNO
 */
public class Verificador {

    public Verificador() {
    }

    public boolean verificar(String cadena, String cadena2, JTextField casilla) {
        if (cadena.isBlank()) {
            System.out.println("Falto llenar un campo");
            JOptionPane.showMessageDialog(null, "Error: Faltan Datos" + cadena2);
            casilla.requestFocus();
            return true;
        }
        return false;
    }

    public boolean verificar(String cadena[]) {
        return false;
    }

    public boolean verificarEntero(String cadena, String cadena2, JTextField casilla) {
        if (this.verificar(cadena, cadena2, casilla)) {
            return true;
        }

        try {
            Integer.parseInt(cadena);
        } catch (Exception ex) {
            System.err.println("Error de formato");
            JOptionPane.showMessageDialog(null, "Formato incorrecto, espero Número");
            casilla.requestFocus();
            return true;
        }
        return false;
    }
}
