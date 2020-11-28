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
public class M_DobleEnlCPrioridad {

    private NodoP ini, fin = null;
    private char valorEliminar;

    public boolean inserar(char dato, int prioridad) {
        //1.- Construir
        NodoP temp = new NodoP(dato,prioridad);
        //Lista llena;
        if (temp == null) {
            return false;
        }
        //Está vacía la lista doble enlazada?
        if (ini == null && fin == null) {
            ini = fin = temp;
            return true;
        }
        //3
        if (temp.prioridad > fin.prioridad) {
            if (temp.prioridad > ini.prioridad) {
                /*Que se enlace al principio
                Si la prioridad de temp(nuevo en la lista) es mayor al último elemento de la lista.
                Y a su vez de mayor al que está al principio/el primero de la lista
                Que el nuevo último se enlzace al principio, dejando como:
               (EL NUEVO)=Doble enlace= (el que estába al principio)*/
                ini.ant = temp;
                temp.sig = ini;
                ini = temp;
                return true;

            } else {

                /*sino es mayor a la prioridad del inicio pero sigue sigendo mayor que el de la prioridad
                del último elemento, averiguaremos la posición donde debe enlazarse
                Recorriendo con el puntero de posicionado (al principio del ciclo) 
                en el elemento anterior del útimo elemento.
                Eh ir decrementando haciendo que temp 2 se posicione en el elemento anterior al que
                ya estaba (temp2.ant).*/
                for (NodoP temp2 = fin.ant;
                        temp.prioridad > temp2.prioridad ;
                        temp2 = temp2.ant) {
                    //temp2==null
                    /*Se POSICIONARÁ EN MEDIO cuando la prioridad del nuevo elemento sea igual
                    al anterior.
                    (EL QUE YA ESTABA CON PRIORIDAD 2) == (EL NUEVO ELEMENTO) == (ELEMENTO CON MENOR PRIORIDAD).
                    Enlazamos*/
                    temp2.sig.ant = temp;
                    //reacomodo de punteros
                    temp.sig = temp2.sig;
                    temp.ant = temp2;
                    temp2.sig = temp;
                    return true;
                    
                }
            }
            /*Si la prioridad del nuevo elemento no es mayor(con más prioridad)que
        el del último elemento de la lista
        //que se enlace al final de la lista.*/

            fin.sig = temp;
            temp.ant = fin;
            fin = temp;
            return true;

        }
        return false;
    }

}
