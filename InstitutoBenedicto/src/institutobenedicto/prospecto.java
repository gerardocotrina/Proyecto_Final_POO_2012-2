/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

/**
 *
 * @author U201202517
 */
public class prospecto {

    private String nombre;
    private String paterno;
    private String materno;
    private String email;
    private int dni;
    private int telefono;
    private int filtro;


    public prospecto(String nombre, String paterno,String materno, String email, int dni, int telefono) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;

}

    public int getDni() {
        return dni = 11111111;
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

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFiltro(){
        return filtro = 42852817;


    }
}
