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
public class NodoD {

    public char valor;
    public NodoD sig, ant;
   

    public NodoD(char dato) {
        valor = dato;
        NodoD sig, ant = null;
        
    }

}


