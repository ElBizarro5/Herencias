/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        super(radio);
    }
    @Override
    public String imprimeFigura() {
        return super.imprimeFigura() + "\nSe imprime un Circulo con radio: " + radio + ", area: " + String.format("%.2f", calcularArea()) + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}