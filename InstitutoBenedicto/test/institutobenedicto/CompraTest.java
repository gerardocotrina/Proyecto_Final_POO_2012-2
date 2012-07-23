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
public class CompraTest {

    public CompraTest() {
    }

    @Test
    public void daraltacompra(){
        Date hoy=new Date();

        Compra compra=new Compra("hojas","002",hoy.toString(),"Grupo gloria",hoy.toString(),hoy.toString(),"nuevo","hojas tamaño A4",120.00,"soles");
        Assert.assertNotNull(compra.getConcepto());
        Assert.assertNotNull(compra.getEmpresa());
        Assert.assertNotNull(compra.getEstado());
        Assert.assertNotNull(compra.getFechaemision());
        Assert.assertNotNull(compra.getFechapago());
        Assert.assertNotNull(compra.getFechavencimiento());
        Assert.assertNotNull(compra.getNumero());
        Assert.assertNotNull(compra.getIgv());
        Assert.assertNotNull(compra.getTotal());
        Assert.assertNotNull(compra.getSubtotal());
        Assert.assertNotNull(compra.getMoneda());



        System.out.println("La alta de la compra  N°"+ compra.getNumero()+"   se dio con exito");
    }

    @Test
public void nopuedodarelaltasinohayconcepto(){
        Date hoy=new Date();
        Compra compra=new Compra("lapiceros","010",hoy.toString(),"Tay Loy",hoy.toString(),hoy.toString(),"nuevo","solo colo azul",320.00,"soles");

        Assert.assertNotNull(compra.getConcepto());
       
        Assert.assertNotNull(compra.getFechaemision());
        
        Assert.assertNotNull(compra.getFechavencimiento());

        Assert.assertNotNull(compra.getIgv());
        Assert.assertNotNull(compra.getTotal());
        Assert.assertNotNull(compra.getSubtotal());
        Assert.assertNotNull(compra.getMoneda());

    System.out.println("Datos de la Compra: "+ compra.getConcepto()+"/ subtotal: " + compra.getSubtotal()+"/ igv :"+ compra.getIgv()+"/    " + compra.getTotal() );

    }


}