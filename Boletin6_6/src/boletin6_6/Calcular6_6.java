/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

/**
 *
 * @author jalvarezbretana
 */
public class Calcular6_6 {

    private String nome_artigo;
    private int num_vendas;

    public Calcular6_6() {

    }

    public Calcular6_6(String nome_artigo, int num_vendas) {
        this.nome_artigo = nome_artigo;
        this.num_vendas = num_vendas;
    }

    public String getNome_artigo() {
        return nome_artigo;
    }

    public void setNome_artigo(String nome_artigo) {
        this.nome_artigo = nome_artigo;
    }

    public int getNum_vendas() {
        return num_vendas;
    }

    public void setNum_vendas(int num_vendas) {
        this.num_vendas = num_vendas;
    }

    public void calcular_tipo() {

        if (num_vendas <= 100) {
            System.out.println("baixo");

        }
        if (num_vendas > 100 && num_vendas <= 500) {
            System.out.println("medio");
        }
        if (num_vendas > 500 && num_vendas <= 1000) {
            System.out.println("alto");

        }
        if (num_vendas > 1000) {
            System.out.println("primeira necesidade");
        }

    }
}
