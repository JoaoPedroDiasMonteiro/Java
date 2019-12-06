/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Eo
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 23;
        z = 7;

        boolean resultado;

        resultado = (z < y && z >= x || x == 10 && z <= 77) ? true : false;
        System.out.println(resultado);
    }

}
