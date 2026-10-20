/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.figuras;

public class TrianguloRecto extends FiguraRecta {

    public TrianguloRecto(int ancho, int alto) {
        super(ancho, alto);
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura() + "\nSe imprime un Triangulo con alto: " + alto + ", ancho: " + ancho + ", area: " + String.format("%.2f", calcularArea()) + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return ancho + alto + Math.sqrt(ancho * ancho + alto * alto);
    }
}