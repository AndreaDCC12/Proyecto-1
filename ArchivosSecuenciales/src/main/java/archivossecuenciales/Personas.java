package archivossecuenciales;

/**
 *
 * @author PERSONal
 */
public class Personas {
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String correo;
    

    public Personas(String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    
    @Override
    public String toString() {
        return "Personas{" + "nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
    
    
    
}
