/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Eo
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita a idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Maior");
        } else if (idade < 17) {
            System.out.println("Menor");
        }

    }

}
