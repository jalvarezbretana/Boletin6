/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Calcular6_2 {

    public void calcular_numero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero");
        short numero_1 = teclado.nextShort();
        System.out.println("Escriba otro numero");
        short numero_2 = teclado.nextShort();
        if (numero_1 >= numero_2) {
            System.out.println("A resta é " + (numero_1 - numero_2));
        }
        System.out.println("A suma é " + (numero_1 + numero_2));

    }

}
