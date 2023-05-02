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
public class Nodo <t> {
    private t elemento;  //elemento ingresado por el usuario de tipo integer luego se probara con datos genericos y comparables
    private Nodo<t> siguiente_nodo=null; // tipo de dato Nodo que almacena a un nodo que se referencia
    // es tipo una matryoshka luego lo dibujare xD
    private Nodo Anterior_nodo=null; //Nodo anterior que referenciara al anterior, asi podremos poner en la k-esima posicion
    private int numpos;
    
    // creamos un constructor para el ingreso a datos finales
    public Nodo(t elemento){
        this.elemento=elemento;
        this.numpos++;
        
    }
    
    // Creamos un constructor para ingresar datos al inicio;
    public Nodo(Nodo <t> sig,t elemento){
        this.elemento=elemento;
        this.siguiente_nodo=sig;
        this.numpos++;
        this.numpos=0;
    }
    // se realiza dos constructores debido a que puede que entren en un ciclo infino de mostrar los datos
    
    //para agregar en la k-esima posicion
    public Nodo(Nodo sig,Nodo ant, t elemento){
        this.Anterior_nodo=ant;
        this.siguiente_nodo=sig;
        this.elemento=elemento;
        this.numpos=0;
    }
    
    // los metodos de encapsulamiento

    public t getElemento() {
        return elemento;
    }

    public void setElemento(t elemento) {
        this.elemento = elemento;
    }

    public Nodo<t> getSiguiente_nodo() {
        return siguiente_nodo;
    }

    public void setSiguiente_nodo(Nodo<t> siguiente_nodo) {
        this.siguiente_nodo = siguiente_nodo;
    }

    public Nodo getAnterior_nodo() {
        return Anterior_nodo;
    }

    public void setAnterior_nodo(Nodo Anterior_nodo) {
        this.Anterior_nodo = Anterior_nodo;
    }

    public int getNumpos() {
        return numpos;
    }

    public void setNumpos(int numpos) {
        this.numpos = numpos;
    }
    
    
    @Override
    public String toString(){
        return "[nodo: "+this.elemento+ "]---->";
    }

    
    
    
    
    
}
