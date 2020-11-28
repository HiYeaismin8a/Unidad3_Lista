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
public class Nodo {
    protected char valor;
    protected Nodo sig;
    
    public Nodo (char dato){
        valor= dato;
        sig = null;
    }
}
