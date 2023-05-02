
public class Profesor extends Persona{
    private int id_profesor;
    private String Nombre_usuario;
    private String Contraseña;

    public Profesor(int id_profesor, String Nombre_usuario, String Contraseña, String nombre, String Apellido, String correo, String celular, String nacimiento, String Direccion) {
        super(nombre, Apellido, correo, celular, nacimiento, Direccion);
        this.id_profesor = id_profesor;
        this.Nombre_usuario = Nombre_usuario;
        this.Contraseña = Contraseña;
    }

  

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
}
