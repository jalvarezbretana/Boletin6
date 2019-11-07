/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Persoas {
       
    private String nombre;
    private float peso;

    public Persoas() {

    }

    public Persoas(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void datos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cal é o nome?");
        this.nombre = teclado.nextLine();
        System.out.println("Cal é o peso?");
        this.peso = teclado.nextInt();
    }
}
