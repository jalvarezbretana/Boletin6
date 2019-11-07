/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoas persoa1 = new Persoas();
        persoa1.datos();
        Persoas persoa2 = new Persoas();
        persoa2.datos();
        if (persoa1.getPeso() > persoa2.getPeso()) {
            System.out.println(persoa1.getNombre() + " ten maior peso");
            System.out.println("A diferenza de peso é " + (persoa1.getPeso()
                - persoa2.getPeso()) + "kg.");
        } else {
            System.out.println(persoa2.getNombre() + " ten maior peso");
            System.out.println("A diferenza de peso é " + (persoa2.getPeso()
                - persoa1.getPeso()) + "kg.");
        }
        
    }

}
    
    

