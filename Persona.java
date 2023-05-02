
public class Persona {
    private String nombre;
    private String Apellido;
    private String correo;
    private String celular;
    private String nacimiento;
    private String direccion;

    public Persona(String nombre, String Apellido, String correo, String celular, String nacimiento, String Direccion) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.correo = correo;
        this.celular = celular;
        this.nacimiento = nacimiento;
        this.direccion = Direccion;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", correo=" + correo + ", celular=" + celular + ", nacimiento=" + nacimiento + ", direccion=" + direccion + '}';
    }
    
   
    
    
    
    
}
