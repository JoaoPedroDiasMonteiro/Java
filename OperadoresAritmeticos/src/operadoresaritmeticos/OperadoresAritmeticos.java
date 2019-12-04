/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Eo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        int numero1 = 2;
        int numero2 = 3;
        float media = (numero1 + numero2) / 2f;

        System.out.println(media);

        // 
        int numero = 5;
        int valor = numero++;
        int valor2 = ++numero;

        System.out.println("pós incremento: " + valor);
        System.out.println("pre incremento: " + valor2);

        //
        int x = 5;
        x *= 3;

        System.out.println(x);

        //
        float za = 3.9f;
        int ar = (int) Math.floor(za);
        System.out.println(ar);

        int ceil = (int) Math.ceil(za);
        System.out.println(ceil);
        
        int round = (int) Math.round(za);
        System.out.println(round);
        
        double rand = Math.random();
        System.out.println(rand);
        

    }

}
