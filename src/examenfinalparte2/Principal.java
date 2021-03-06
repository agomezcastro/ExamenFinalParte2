package examenfinalparte2;

import javax.swing.JOptionPane;

public class Principal {

    public static boolean p = false;
 
    /** Main donde se ejecuta el programa
     * en el que se introduce un numero
     * @param arg 
     */
    public static void main(String arg[]) {
        int digitos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        int numeroDigitos = 0;
        if (digitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int auxiliar = i;

            int contador = 0;

            while (auxiliar != 0) {
                auxiliar = auxiliar / 10;
                contador++;
            }
            numeroDigitos = contador;

            Comprobar(numeroDigitos, digitos, i);
        }
    }

    /** Metodo que comprueba el programa
     * funciona como filtro
     * @param numeroDigitos
     * @param digitos
     * @param i 
     */
    public static void Comprobar(int numeroDigitos, int digitos, int i) {
        if (numeroDigitos == digitos) {
            if (i < 4) {
                p = true;
            } else {
                if (i % 2 == 0) {
                    p = false;
                } else {
                    int contador1 = 0;
                    int i1 = 1;
                    int k = (i - 1) / 2;
                    if (k % 2 == 0) {
                        k--;
                    }
                    
                    while (i1 <= k) {
                        if (i % i1 == 0) {
                            contador1++;
                        }
                        i1 += 2;
                        if (contador1 == 2) {
                            i1 = k + 1;
                        }
                    }
                    
                    if (contador1 == 1) {
                        p = true;
                    }
                }
            }
            
            if (p == true) {
                System.out.println(i);
            }
        }
    }

}
