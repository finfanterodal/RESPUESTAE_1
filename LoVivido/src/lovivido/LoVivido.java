/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        String n;
        String e;

        int m;
        int d;
        int h;
        int a;

        n = JOptionPane.showInputDialog("Escriba su nombre: ");
        e = JOptionPane.showInputDialog("Escriba su edad: ");

        a = Integer.parseInt(e);

        m = (a * 12);
        d = (a * 365);
        h = (d * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + m, "Numero de meses vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + d, "Numero de días vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + h, "Numero de horas vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
