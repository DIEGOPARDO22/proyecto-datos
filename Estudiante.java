/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author dvpy4
 */
public class Estudiante extends Persona {

    private int Num_cursos;
    private String DNI;
    private String tipo_matricula;

    public Estudiante(int Num_cursos, String nombre, String Apellido, String correo, String celular, String DNI, String nacimiento, String direccion, String tipo_matricula) {
        super(nombre, Apellido, correo, celular, nacimiento, direccion);
        this.Num_cursos = Num_cursos;
        this.DNI = DNI;
        this.tipo_matricula = tipo_matricula;
    }

    public int getNum_cursos() {
        return Num_cursos;
    }

    public void setNum_cursos(int Num_cursos) {
        this.Num_cursos = Num_cursos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        if (DNI.length() == 8) {
            this.DNI = DNI;
        } else {

        }

    }

    public String getTipo_matricula() {
        return tipo_matricula;
    }

    public void setTipo_matricula(String tipo_matricula) {
        this.tipo_matricula = tipo_matricula;
    }
    

    public String toString() {
        return "DNI: " + this.getDNI() + "NUM_CURSO: " + this.getNum_cursos() + super.toString();
    }

}
