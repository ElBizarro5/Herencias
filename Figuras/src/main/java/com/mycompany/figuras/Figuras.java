/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

public class Figuras {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRecto(3, 4);
        System.out.println(f.imprimeFigura());

        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}