/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author dvpy4
 */
public class admi extends Persona {
    private String DNI;
    private String cod_Infor;

    public admi(String DNI, String cod_Infor, String nombre, String Apellido, String correo, String celular, String nacimiento, String Direccion) {
        super(nombre, Apellido, correo, celular, nacimiento, Direccion);
        this.DNI = DNI;
        this.cod_Infor = cod_Infor;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCod_Infor() {
        return cod_Infor;
    }

    public void setCod_Infor(String cod_Infor) {
        this.cod_Infor = cod_Infor;
    }
    
    
}
