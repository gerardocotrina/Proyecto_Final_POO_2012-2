/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

import junit.framework.Assert;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class GrupoEstudioTest {

    public GrupoEstudioTest() {
    }

    @Test
    public void DarAltaGrupoEstudio(){
        Date hoy=new Date();
        GrupoEstudio grupo=new GrupoEstudio("Grupo POO","Grupo de programacion","UPC","POO",hoy.toString(),hoy.toString(),"accesoacursodeprogramacion","EA-12","MO","googleDoc","En curso");
Assert.assertNotNull(grupo.getNombre());
Assert.assertNotNull(grupo.getDescripcion());
Assert.assertNotNull(grupo.getCurso());
Assert.assertNotNull(grupo.getAula());
Assert.assertNotNull(grupo.getAcademia());
Assert.assertNotNull(grupo.getFechainicio());
Assert.assertNotNull(grupo.getFechafin());
Assert.assertNotNull(grupo.getLink());
Assert.assertNotNull(grupo.getLocal());
Assert.assertNotNull(grupo.getCoordenadas());
Assert.assertNotNull(grupo.getEstado());





    }

}