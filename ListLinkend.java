/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fase2;

/**
 *
 * @author dvpy4
 * @param <t>
 */
public class ListLinkend<T>  {

    public Nodo<T> first;
    private int key;

    private T value;

    private ListLinkend<T> next;

    public ListLinkend() {
        this.first = null;
    }

    public ListLinkend(int key, T value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int search(T x) {
        int position = -1;
        boolean find = false;
        Nodo<T> aux = this.first;
        while (aux != null) {
            position = position + 1;
            if (aux.getElemento()== x) {
                find = true;
                return position;
            }
            aux = aux.getSiguiente_nodo();
        }
        if (!find) {
            position = -1;
        }
        return position;
    }

    public void insertFirst(T x) {
        Nodo<T> nuevo = new Nodo<T>(first, x);
        first = nuevo;
    }

    public void insertLast(T x) {
        Nodo<T> nuevo = new Nodo<T>(null, x);
        if (first == null) {
            first = nuevo;
        } else {
            Nodo<T> actual = first;
            while (actual.getSiguiente_nodo()!= null) {
                actual = actual.getSiguiente_nodo();
            }
            actual.setSiguiente_nodo(nuevo);
        }
    }

    public void removeNode(T x) {
        if (first == null) {
            System.out.println("lista vacï¿½a");
        } else if (first.getElemento()== x) {
            first = first.getSiguiente_nodo();
        } else {
            Nodo<T> actual = first;
            while (actual.getSiguiente_nodo()!= null && actual.getSiguiente_nodo().getElemento()!= x) {
                actual = actual.getSiguiente_nodo();
            }
            if (actual.getSiguiente_nodo() == null) {
                System.out.println("El elemento " + x + " no existe");
            } else {
                actual.setSiguiente_nodo(actual.getSiguiente_nodo().getSiguiente_nodo());
            }
        }
    }

    public String toString() {
        int contador = 0;
        if (first != null) {
            String str = "";
            Nodo<T> actual = first;
            while (actual.getSiguiente_nodo()!= null) {
                contador = contador + 1;
                str += (actual.getElemento()+ ", ");
                actual = actual.getSiguiente_nodo();
            }
            str += actual.getElemento();
            return "Parientes > " + str;
        } else {
            return "Lista Vacï¿½a";
        }
    }

    public int length() {
        int size = 1;
        Nodo<T> actual = first;
        while (actual.getSiguiente_nodo()!= null) {
            size = size + 1;
            actual = actual.getSiguiente_nodo();
        }
        return size;
    }

    public void destroyList() {
        Nodo<T> actual = first;
        while (actual.getSiguiente_nodo()!= null) {
            actual = actual.getSiguiente_nodo();
            this.removeNode(actual.getElemento());
        }
        first = null;
    }


    public T getValue() {

        return value;

    }

    public void setValue(T value) {

        this.value = value;

    }

    public int getKey() {

        return key;

    }

    public ListLinkend getNext() {

        return next;

    }

    public void setNext(ListLinkend next) {

        this.next = next;

    }
}
