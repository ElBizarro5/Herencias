/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.profesor;

public class Profesor extends Persona {
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        super();
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad
                + ", con clave " + numEmpleado;
    }
}