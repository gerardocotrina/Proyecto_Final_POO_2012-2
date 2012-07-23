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
    private String nombreusuario;
    private String clave;
    private String codigoRol;

    public Usuario (String nombreusuario,String clave,String codigoRol){
        this.nombreusuario=nombreusuario;
        this.clave=clave;
        this.codigoRol=codigoRol;

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

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    

}
