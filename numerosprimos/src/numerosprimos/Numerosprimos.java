/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author finfanterodal
 */
public class Numerosprimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean estado = false;

    public static void main(String arg[]) {
        int numero_digitos = 0;
        int numDigitos = 0;
        numero_digitos = Integer.parseInt(arg[0]);
        if (numero_digitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int cont = 1; cont <= 99999; cont++) {
            int divisionEntera = cont;

            int contador0 = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador0++;
            }
            numDigitos = contador0;

            if (numDigitos == numero_digitos) {
                if (cont < 4) {
                    estado = true;
                } else {
                    if (cont % 2 == 0) {
                        estado = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (cont - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (cont % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            estado = true;
                        }
                    }
                }

                if (estado == true) {
                    System.out.println(cont);
                }
            }
        }
    }

}
