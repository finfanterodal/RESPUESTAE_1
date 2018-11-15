/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class LoVivido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Código Formateado
        String nombre;
        String edad;

        int meses;
        int dias;
        int horas;
        int edad_int;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        edad_int = Integer.parseInt(edad);

        meses = (edad_int * 12);
        dias = (edad_int * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
