/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HiYeaismin 8a
 */
public class NodoP {

    public char valor, datoAComparar;
    public NodoP sig, ant;
    public int prioridad;

    public NodoP(char dato, int p) {
        valor = dato;
        NodoP sig, ant = null;
        prioridad = p;
    }

    public NodoP() {
    }

    public NodoP(char valor, char datoAComparar) {
        this.valor = valor;
        this.datoAComparar = datoAComparar;
    }
    

    public String getData() {
        return valor + " Prioridad: " + prioridad;
    }
}
