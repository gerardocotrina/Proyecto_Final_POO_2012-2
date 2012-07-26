/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package institutobenedicto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frank U
 */
public class Clientes_finalTest {
    
    public Clientes_finalTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Clientes_final.
     */

    @Test 
            public void buscarclientes (){
        
     altaclientes nombre2=new altaclientes("frank", "maura", "arias", "frank@gmail.com", 46464646, 838383838, "22/10/2012");  

     int dni2=46464646;   
     int dni3=46464647;   
     if (nombre2.getDni()== dni2){
            System.out.println("cliente es: "+ nombre2.getNombre());
        System.out.println("el apellido paterno es: "+nombre2.getApellidopaterno());
        System.out.println("el apellido materno es: "+ nombre2.getApellidomaterno());
        System.out.println("el mail es: "+ nombre2.getEmail());
        System.out.println("el dni es: "+ nombre2.getDni());
        System.out.println("el telefono es: "+ nombre2.getTelefono());
        System.out.println("La fecha del Contacto es: "+ nombre2.getFechacontacto());
            }else{
            System.out.println("no se encontraron registros para los filtros ingresados");
        }        
                     
    }
}
