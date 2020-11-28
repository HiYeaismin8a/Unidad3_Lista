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
public class ListaConValores {
  
  private NodoP ini, fin;
    private char valorEliminar;

    public ListaConValores(NodoP ini, NodoP fin) {
        this.ini = ini;
        this.fin = fin;
    }

    public ListaConValores() {
    }

    public boolean insertar(char dato, char p) {
        //Construcción
        NodoP nuevo = new NodoP(dato, p);

        //Caso 1.- No hay nodos
        if (nuevo == null) {
            return false;
        }
        //Caso 2.- El "nuevo" elemento es el unico nodo
        if (ini == null && fin == null) {
            ini = fin = nuevo;
            return true;
        }
        //Caso 3a, si la datoAComparar del nuevo es mayor que ini 
        if (nuevo.datoAComparar > ini.datoAComparar) {
            ini.ant = nuevo;

            nuevo.sig = ini;
            ini = nuevo;
            return true;
        }
        //3b si la datoAComparar del nuevo es menor que la datoAComparar de fin
        if (nuevo.datoAComparar <= fin.datoAComparar) {
            fin.sig = nuevo;
            nuevo.ant = fin;
            fin = nuevo;
            return true;
        }

        //4to caso, el nuevo se enlaza en medio
        NodoP temp2;
        for (temp2 = fin.ant;
                nuevo.datoAComparar > temp2.datoAComparar;
                temp2 = temp2.ant) {
            /*VACIO*/
        }
        temp2.sig.ant = nuevo;
        nuevo.sig = temp2.sig;
        temp2.sig = nuevo;
        nuevo.ant = temp2;
        return true;

    }

    public String mostrar() {
        if (ini == null && fin == null) {
            return "Lista vacía";
        }
        return mostrar(ini);
    }

    private String mostrar(NodoP temp) {
        if (temp == null) {
            return "";
        }
        return temp.valor + " -> " + mostrar(temp.sig);
    }

   public boolean eliminar(char v, char p) {
        //1.- CASO 1
        if (ini == null && fin == null) {
            return false;
        }
        //2.- 
        if (ini == fin && ini != null) {
            if (ini.valor == v && ini.datoAComparar == p) {
                ini = fin = null;
                return true;
            }
            return false;
        }
        //Caso 3a.- si el valor está en ini
        if (ini.valor == v && ini.datoAComparar == p) {
            NodoP temp = ini.sig;
            temp.ant = null;
            ini.sig = null;
            ini = temp;
            return true;
        }

        // caso 3b si el valor a eliminar están en fin
        if (fin.valor == v && fin.datoAComparar == p) {
            NodoP temp = fin.ant;
            temp.sig = null;
            fin.ant = null;
            fin = temp;
            return true;
        }
        for (NodoP temp = ini.sig; temp != fin; temp = temp.sig) {
            if (temp.valor == v && temp.datoAComparar == p) {
                temp.ant.sig = temp.sig;
                temp.sig.ant = temp.ant;
                temp.sig = null;
                temp.ant = null;
                return true;
            }
        }
        return false;
    }


}
