/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Calcular6_1 {

    public void calcular_numero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero.");
        int respuesta = teclado.nextInt();
        if (respuesta >= 0) {
            System.out.println("Es positivo.");
        }
    }
}
