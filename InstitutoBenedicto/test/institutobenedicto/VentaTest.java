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
public class VentaTest {

    public VentaTest() {
    }

@Test
public void dardealtaventa(){
    Date hoy=new Date();
    Venta venta = new Venta("libros","001",hoy.toString(),"UPC",hoy.toString(),hoy.toString(),"nuevo");
    Assert.assertNotNull(venta.getClass());
    Assert.assertNotNull(venta.getEmpresa());
    Assert.assertNotNull(venta.getFechaemision());
    Assert.assertNotNull(venta.getFechapago());
    Assert.assertNotNull(venta.getFechavencimiento());
    Assert.assertNotNull(venta.getNumero());
    System.out.println("Se registro exitosamente la venta N°"+ venta.getNumero()+"  para la Empresa :"+ venta.getEmpresa()+" ; el dia  " + venta.getFechaemision());

}

@Test
public void buscarventasegunnumero(){

    Date hoy=new Date();
    Venta venta = new Venta("libros","001",hoy.toString(),"UPC",hoy.toString(),hoy.toString(),"nuevo");

    Assert.assertEquals("001", venta.getNumero());
       System.out.println("La venta si existe para la empresa: "+ venta.getEmpresa());

}

@Test
public void buscarventasegunempresa(){

    Date hoy=new Date();
    Venta venta = new Venta("libros","002",hoy.toString(),"UPC",hoy.toString(),hoy.toString(),"nuevo");

    Assert.assertEquals("UPC", venta.getEmpresa());
       System.out.println("La empresa si tiene registros");

}
}