/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

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
        Usuario usu = new Usuario("chuamani","1234560","01");

        Assert.assertEquals(usu.getNombreusuario(), "chuamani");
        
    }

    @Test
    public void validaclave(){
        Usuario usu = new Usuario("chuamani","1234560","01");
        Assert.assertEquals(usu.getClave(), "1234560");
       
    }

    
}