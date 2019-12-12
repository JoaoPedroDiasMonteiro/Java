/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Eo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        int soma = 0;
        int pares = 0;
        int impares = 0;
        int acimaCem = 0;
        int cont = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número (valor 0 interrompe)"));
            soma += numero;

            // contagem números ímpares e pares
            if (numero % 2 == 0 && numero != 0) {
                pares++;
            } else if (numero != 0) {
                impares++;
            }
            // contagem números acima de cem
            if (numero >= 100) {
                acimaCem++;
            }
            
        } while (numero != 0);
        
        // imprimir resultado
        JOptionPane.showMessageDialog(null, "<html>O resultado da soma é: " + soma
                + "<br> Total de pares: " + pares
                + "<br> Total de ímpares: " + impares
                + "<br> Acima de cem: " + cont
                + "<br> Média: " + (float) soma / (pares + impares)
                + "</html");
    }

}
