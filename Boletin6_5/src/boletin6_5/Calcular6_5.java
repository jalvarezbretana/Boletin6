/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Calcular6_5 {

    public void calcular_numero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 3 numeros(distintos)");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3 = teclado.nextInt();
        if (numero1 > numero2) {
            int pos_max = numero1;
            if (pos_max > numero3) {
                System.out.println(pos_max + " é o maior");
            } else {
                System.out.println(numero3 + " é o maior");

            }
        } else {
            int pos_max = numero2;
            if (pos_max > numero3) {
                System.out.println(pos_max + " é o maior");
            } else {
                System.out.println(numero3 + " é o maior");
            }
        }
    }
}
