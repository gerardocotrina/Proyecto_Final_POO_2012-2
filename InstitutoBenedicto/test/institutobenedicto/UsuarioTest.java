/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

import java.util.Date;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class UsuarioTest {

    public UsuarioTest() {
    }

    @Test

    public void validausuario(){
        Date hoy=new Date();

        Usuario usu = new Usuario("Carlos","Huamani","42356082","chuamanirojas@gmail.com",hoy.toString(),"estudiante","chuamani","1234560","01");
            String usuarioesperado="";
            String claveesperada="";

usu.ValidaUsuarioNulo(usuarioesperado);
usu.ValidaClaveNula(claveesperada);

        if ((usu.getNombreusuario()== usuarioesperado)  && (usu.getClave()==claveesperada)){
                 System.out.println("Usuario validado ");
            }
        else
        {
            System.out.println("Usuario o contraseña incorrecta ");
        }

         
        }



    
}