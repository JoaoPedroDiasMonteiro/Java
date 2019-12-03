/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Eo
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("A resolução da tela é: ");
        System.out.print(resolucao.width);
        System.out.print("X");
        System.out.print(resolucao.height);

    }
    
}
