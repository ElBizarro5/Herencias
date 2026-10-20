/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

public abstract class FiguraRecta extends Figura2D {

    protected int ancho;
    protected int alto;

    public FiguraRecta(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}