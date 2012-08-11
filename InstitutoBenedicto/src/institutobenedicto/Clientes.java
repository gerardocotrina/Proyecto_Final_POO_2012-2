/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package institutobenedicto;

/**
 *
 * @author Frank U
 */
public class Clientes {
    
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String email;
    private int dni;
    private int telefono;
    private String fechacontacto;

    public Clientes() {
    }

    public Clientes(String nombre) {
        this.nombre = nombre;
    }
    

//    public Clientes(String nombre, String apellidopaterno, String apellidomaterno, String email, int dni, int telefono, String fechacontacto) {
//        this.nombre = nombre;
//        this.apellidopaterno = apellidopaterno;
//        this.apellidomaterno = apellidomaterno;
//        this.email = email;
//        this.dni = dni;
//        this.telefono = telefono;
//        this.fechacontacto = fechacontacto;
//    }

    public Clientes(String nombre, String apellidopaterno, String apellidomaterno, String email, int dni, int telefono, String fechacontacto) {
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.fechacontacto = fechacontacto;
    }
    
    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechacontacto() {
        return fechacontacto;
    }

    public void setFechacontacto(String fechacontacto) {
        this.fechacontacto = fechacontacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
 
}
