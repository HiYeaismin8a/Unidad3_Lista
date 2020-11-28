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
public class ListaDobleEnlazada {

    private NodoD ini, fin = null;
    private char valorEliminar;

    public boolean inserar(char dato) {

        NodoD temp = new NodoD(dato);
        //Lista llena;
        if (temp == null) {
            return false;
        }
        //Está vacía la lista doble enlazada?
        if (ini == null && fin == null) {
            ini = fin = temp;
            return true;
        }
        fin.sig = temp;
        temp.ant = fin;
        fin = temp;
        return true;
        
    }

    public boolean eliminar(){
       if(ini== null && fin ==null){
           return true;
       }
       if(ini== fin && ini!=null){
           fin=ini=null;
           return true;
       }
       NodoD temp = ini.sig;
       temp.ant= null;
       ini.sig = null;
       ini= temp;
        return true;
    }
    public boolean eliminarElementoEspecifico(char dato) {
         //La lista está vacía;
        if(ini == null && fin == null){
            return false;
        }
        if(ini== fin && fin != null){
            if(ini.valor ==dato){
                ini=fin=null;
                return true;
            }
            return false;
        }
        if(ini.valor == dato){
            return eliminar();
        }
        if(fin.valor == dato){
            NodoD temp = fin.ant;
            temp.sig= null;
            fin= temp;
            return true;
        }
        for (NodoD temp = ini.sig; temp != null; temp = temp.sig) {
            if(temp.valor == dato){
                temp.ant.sig= temp.sig;
                temp.sig.ant= temp.ant;
                temp.ant= null;
                temp.sig= null;
                return true;    
            }
        }
        return false;
    }

    public String mostrar(Nodo nodo){
        if(ini== null && fin ==null){
            return ("La lista está vacía.");
        }
        if(nodo.sig == null){
            return (" "+ nodo.valor);
        }
        Nodo temp= nodo;
        return " "+ temp.valor + mostrar(temp.sig);
    }
    
}
