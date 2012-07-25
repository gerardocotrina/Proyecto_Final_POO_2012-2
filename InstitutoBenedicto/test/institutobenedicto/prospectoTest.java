/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

import java.util.Locale;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author U201202517
 */
public class prospectoTest {

prospecto prospecto = new prospecto("Gerardo","Cotrina","Leguia","u201202517@upc.edu.pe",42852817,987654321);


    @Test
    public void DarDeAltaProspecto(){
        prospecto prospecto = new prospecto("Gerardo","Cotrina","Leguia","u201202517@upc.edu.pe",42852818,987654321);
        
        if(11111112 == prospecto.getDni()){
        System.out.println("El prospecto ya existe,no se puede dar de alta");}
        else
        Assert.assertNotNull(prospecto.getNombre());
        Assert.assertNotNull(prospecto.getPaterno());
        Assert.assertNotNull(prospecto.getMaterno());
        Assert.assertNotNull(prospecto.getEmail());
        Assert.assertNotNull(prospecto.getTelefono());
        System.out.println("El prospecto fue dado de alta");
        
        
    }
    
    @Test
    public void BuscarProspectoPorDNI(){
        
        if (prospecto.getFiltro() == prospecto.getDni()){
            System.out.println("El prospecto fue encontrado");}
            else 
        
        System.out.println("El prospecto no fue encontrado");
       
    }

    @Test
    public void DarDeBajaProspecto(){
        prospecto prospecto = new prospecto("Gerardo","Cotrina","Leguia","u201202517@upc.edu.pe",42852817,987654321);
        Assert.assertNotNull(prospecto.getNombre());
        Assert.assertNotNull(prospecto.getPaterno());
        Assert.assertNotNull(prospecto.getMaterno());
        Assert.assertNotNull(prospecto.getEmail());
        Assert.assertNotNull(prospecto.getDni());
        Assert.assertNotNull(prospecto.getTelefono());
        System.out.println("El prospecto ha sido dado de baja");


    }
}