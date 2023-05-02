/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author dvpy4
 */
public class Curso {

    private int id_curso;
    private int id_profesor;
    private int id_escuela;
    private String Descripcion;
    private int costo_credito_teo;
    private int costo_credito_prac;
    private int total_credito;
    private int cont_inscripcion;
    private char grupo;
    private String nombre;
    private double nota_practica;
    private double nota_teoria;
    private double promedio;
    private String SEc;
    private String horario;
    private String aula;
    public Curso(int id_curso, int id_profesor, int id_escuela, String Descripcion, int costo_credito_teo, int costo_credito_prac, int cont_inscripcion, char grupo, String nombre, double Nota_practica, double Nota_teoria, String SEc, String horario,String aula) {
        this.id_curso = id_curso;
        this.id_profesor = id_profesor;
        this.id_escuela = id_escuela;
        this.Descripcion = Descripcion;
        this.costo_credito_teo = costo_credito_teo;
        this.costo_credito_prac = costo_credito_prac;
        this.cont_inscripcion = cont_inscripcion;
        this.total_credito = this.costo_credito_prac + this.costo_credito_teo;
        this.grupo = grupo;
        this.nombre = nombre;
        this.nota_practica = Nota_practica;
        this.nota_teoria = Nota_teoria;
        this.promedio = (this.nota_practica * 0.3) + (this.nota_teoria * 0.7);
        this.SEc=SEc;
        this.horario=horario;
        this.aula=aula;
    }

    public Curso(int id_curso, char grupo, String nombre, double nota_practica, double nota_teoria, String SEc, String horario, String aula) {
        this.id_curso = id_curso;
        this.grupo = grupo;
        this.nombre = nombre;
        this.nota_practica = nota_practica;
        this.nota_teoria = nota_teoria;
        this.SEc = SEc;
        this.horario = horario;
        this.aula = aula;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota_practica() {
        return nota_practica;
    }

    public void setNota_practica(double nota_practica) {
        this.nota_practica = nota_practica;
    }

    public double getNota_teoria() {
        return nota_teoria;
    }

    public void setNota_teoria(double nota_teoria) {
        this.nota_teoria = nota_teoria;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio = (this.nota_practica * 0.3) + (this.nota_teoria * 0.7);
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCosto_credito_teo() {
        return costo_credito_teo;
    }

    public void setCosto_credito_teo(int costo_credito_teo) {
        this.costo_credito_teo = costo_credito_teo;
    }

    public int getCosto_credito_prac() {
        return costo_credito_prac;
    }

    public void setCosto_credito_prac(int costo_credito_prac) {
        this.costo_credito_prac = costo_credito_prac;
    }

    public int getTotal_credito() {
        return total_credito;
    }

    public void setTotal_credito() {
        this.total_credito = this.costo_credito_prac + this.costo_credito_teo;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public int getCont_inscripcion() {
        return cont_inscripcion;
    }

    public void setCont_inscripcion(int cont_inscripcion) {
        this.cont_inscripcion = cont_inscripcion;
    }

    public String getSEc() {
        return SEc;
    }

    public void setSEc(String SEc) {
        this.SEc = SEc;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    
    
    
    

}
