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
 * @author u201202517
 */
public class RolesTest {

    public RolesTest() {
    }

    @Test

    public void todosloscampossonobligatorios(){
      Roles rol =new Roles ("administrativo","logistica",1,1,1,1);
      Assert.assertNotNull(rol.getNombrerol());
      Assert.assertNotNull(rol.getModulo());
      Assert.assertNotNull(rol.getNuevo());
      Assert.assertNotNull(rol.getEditar());
      Assert.assertNotNull(rol.getEliminar());
      Assert.assertNotNull(rol.getAcceso());


    }


    @Test

    public void descripciondelrol(){
      Roles rol =new Roles ("administrativo","logistica",1,1,0,1);

      if (rol.getAcceso()==1){
        System.out.println("El rol : "+ rol.getNombrerol() +"  tiene acceso al modulo "+ rol.getModulo() );

      }

            if (rol.getEditar()==1){
        System.out.println("El rol : "+ rol.getNombrerol() +"  puede editar en el modulo "+ rol.getModulo() );

      }


            if (rol.getNuevo()==1){
        System.out.println("El rol : "+ rol.getNombrerol() +" puede crear en el modulo "+ rol.getModulo() );

      }

            if (rol.getEliminar()==1){
        System.out.println("El rol : "+ rol.getNombrerol() +"  puede eliminar en el  modulo "+ rol.getModulo() );

      }
      


    }
}