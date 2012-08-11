package institutobenedicto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerardo
 */
public class AdministradorTest {

        
    @Test
    public void todosLosCamposSonObligatorios() {

        Usuario usuario = new Usuario("Gerardo", "cotrina", "12345678", "gerardo.cotrina@gmail.com", "01-01-2012","Empleado", "gcotrina","123456", "rol001");
        if (usuario.getApellidos()==null){
        System.out.println("El campo Apellido es obligatorio");
        }
        else
        Assert.assertNotNull(usuario.getNombre());
        Assert.assertNotNull(usuario.getApellidos());
        Assert.assertNotNull(usuario.getEmail());
        Assert.assertNotNull(usuario.getDni());
        Assert.assertNotNull(usuario.getFechaingreso());
        Assert.assertNotNull(usuario.getCargo());
        Assert.assertNotNull(usuario.getNombreusuario());
        Assert.assertNotNull(usuario.getClave());
        Assert.assertNotNull(usuario.getCodigoRol());
        System.out.println("El usuario fue ingresado");
   }

    @Test
    public void eliminarUsuario(){
    Usuario usuario = new Usuario("Juan", "Perez", "12345678", "juanperez@gmail.com", "01-01-2012","Empleado", "jperez","123456", "rol001");

    usuario.ValidaUsuario(usuario.getNombreusuario());
    
    
    }

}