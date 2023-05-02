/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author dvpy4
 */
public class Escuela {
    private int id_escuela;
    private String Nombre_escuela;
    private int id_facultad;

    public Escuela(int id_escuela, String Nombre_escuela, int id_facultad) {
        this.id_escuela = id_escuela;
        this.Nombre_escuela = Nombre_escuela;
        this.id_facultad = id_facultad;
    }

    
    
    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getNombre_escuela() {
        return Nombre_escuela;
    }

    public void setNombre_escuela(String Nombre_escuela) {
        this.Nombre_escuela = Nombre_escuela;
    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }
    
    
}
