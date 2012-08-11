/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

/**
 *
 * @author CARLOS
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String fechaingreso ;
    private String cargo;
    private String nombreusuario;
    private String clave;
    private String codigoRol;

    public Usuario(String nombre, String apellidos, String dni, String email, String fechaingreso, String cargo, String nombreusuario, String clave, String codigoRol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.fechaingreso = fechaingreso;
        this.cargo = cargo;
        this.nombreusuario = nombreusuario;
        this.clave = clave;
        this.codigoRol = codigoRol;
    }

    public Usuario() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = null;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

 
public void ValidaUsuarioNulo(String usuarioesperado){
    if (usuarioesperado==""){
         System.out.println("Ingrese su usuario ");

    }



}
     public void ValidaClaveNula(String claveesperada){
           if (claveesperada==""){
         System.out.println("Ingrese su clave");

    }
    }

     public void ValidaUsuario(String validausuario){
         int transacciones = 1;
    if (transacciones>0){
        System.out.println("usuario activo, no se puede eliminar");}
        else
            System.out.println("usuario inactivo, se procede a eliminar");


    }



}
    

