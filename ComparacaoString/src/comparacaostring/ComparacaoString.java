/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Eo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Zé";
        String nome2 = "Zé";
        String nome3 = new String("Zé");

        String resultado = nome1.equals(nome3) ? "igual" : "diferente";
        
        System.out.println(resultado);
    }

}
