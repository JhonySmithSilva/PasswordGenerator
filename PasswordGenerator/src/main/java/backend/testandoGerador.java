/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author jony_
 */
public class testandoGerador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GeneratingPassword gerar = new GeneratingPassword();
        
        gerar.setNumberOfCharacters(3);
        gerar.start();
        System.out.println(gerar.toString());
    }
    
}
