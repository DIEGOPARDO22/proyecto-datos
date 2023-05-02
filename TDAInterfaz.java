/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Fase2;

/**
 *
 * @author dvpy4
 * @param <t>
 */
public interface TDAInterfaz <t>{
    boolean isEmpty();
    int length();
    void destroyList();
    boolean search (t elemento);
    void insertFirst(t elemento);
    void insertLast(t elemento);
    void removeNode(t elemento);
}
