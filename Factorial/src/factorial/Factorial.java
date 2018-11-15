/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author finfanterodal
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Código formateado
        //Ahora cambiamos los nombres a las variables
        int num1;
        int num2;
        num1 = 8;
        int contador;
        if (num1 == 0) {
            num2 = 1;
        } else {
            num2 = 1;
            for (contador = num1; contador >= 1; contador--) {
                num2 = num2 * contador;
            }
        }

        System.out.println(num2);
    }

}
