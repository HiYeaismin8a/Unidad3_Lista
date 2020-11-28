/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class ListaSimple {

    private Nodo ini = null;
    private Nodo fin = null;
    private char valorEliminado;

    public boolean insertar(char dato) {
        // 1.- Construcción
        Nodo temp = new Nodo(dato);
        if (temp == null) {
            //Sí temp continua en null, sig. que la LISTA LLENA
            return false;
        }
        //2.- ENLAZAR:
        //eL Nuevo nodo es el único. Insertar el primer valor.
        if (ini == null && fin == null) {
            ini = fin = temp;
            return true;
        }
        //Enlazar el último nodo con el nuevo nodo.
        fin.sig = temp;
        fin = temp;
        return true;
    }

    public boolean eliminar() {
        //Si está vacía la lista.
        if (ini == null && fin == null) {
            return false;
        }
        //Se revisa si hay 1 solo nodo
        if (ini == fin && fin != null) {
            fin = ini = null;
            return true;
        }

        //Si hay más de 2nodos, Deselanzar el primero
        //Entonces el 2do será el "Nuevo" Primero
        Nodo temp = ini.sig;
        ini.sig = null;
        ini = temp;
        return true;
    }

    public boolean eliminar(char valorAEliminado) {
        //Lista vacía.- 1caso
        if (ini == null && fin == null) {
            return false;
        }
        
        //2 caso 1 solo elemento
        if (ini == fin && ini != null && ini.valor == valorAEliminado) {
            ini = fin = null;
            return true;
        }

        //3caso el valor se encuentre en INI
        if (ini.valor == valorAEliminado) {
            return eliminar();
        }

        //4caso que el valor se encuentre en INI
        for (Nodo temp = ini.sig, temp2 = ini;
                temp != null;
                temp = temp.sig, temp2 = temp2.sig) {
            if (temp.valor == valorAEliminado) {
                if (temp == fin) {
                    fin = temp2;
                    fin.sig = null;
                    return true;
                } else {
                    temp2.sig = temp.sig;
                    temp.sig = null;
                    return true;
                }
            }
        }
        return false;
    }
    

   
    public String mostrar() {
        if (ini == null && fin == null) {
            return "La lista está vacía";
        }
        return mostrar(ini);
    }

    public String mostrar(Nodo temp) {
        if (temp == null) {
            return "";
        }
        return temp.valor + " -->> " + mostrar(temp.sig);
    }
 /*public String mostrarLista() {
        //Mi apuntador de datos mientras/para moestro/mostrar;
        Nodo temp;
        //HAY NODOS
        if (ini != null && fin != null) {
            //Recorre la lista desde ini (el primero) #TEMP ARRANCA SIEMPRE EN INI#
            temp = ini;
            //if(temp == null)--- SINO muestra valor; avanza;
            while (temp != null) {
                //Imprimir el valor de cada cada nodo recorrido mientras el nodo no esté vacío.
                JOptionPane.showMessageDialog(null, temp.valor);
                temp = temp.sig;
            }
            //Si ini se encuentra es nulo sig. que la lista está vacía.
            JOptionPane.showMessageDialog(null, "Lista vacía");
        }
        return true;
     */
    
    
    
    
    
    /*public boolean elimnarElementoEspecífico(char dato) {
        
        Nodo temp, temp2;
        temp2 = ini;
        temp = ini.sig;
        //Vacía
        if (ini == null && fin == null) {
            return false;
        }
        //Un solo elemento
        
        //Eliminar el último elemento de la lista.
        if (temp == ini) {
            valorEliminado = fin.valor;
            fin=temp2;
            //temp = temp2; -> Dijo que no hacía falta que bastaba con el "return";
            temp2.sig = null;
            return true;
        }
        do {
            temp2.sig = temp.sig;
            temp.sig = null;
            return true; //if
        } while (temp.valor != dato); 
    }*/
}
