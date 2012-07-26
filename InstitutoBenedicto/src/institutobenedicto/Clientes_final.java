/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package institutobenedicto;

/**
 *
 * @author Frank U
 */
public class Clientes_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        altaclientes nombre1=new altaclientes("juan", "perez", "", "123@123.com", 46464646, 838383838, "22/10/2012");
        
//        
//        System.out.println("cliente es: "+ nombre1.getNombre());
//        System.out.println("el apellido paterno es: "+nombre1.getApellidopaterno());
//        System.out.println("el apellido materno es: "+ nombre1.getApellidomaterno());
//        System.out.println("el mail es: "+ nombre1.getEmail());
//        System.out.println("el dni es: "+ nombre1.getDni());
//        System.out.println("el telefono es: "+ nombre1.getTelefono());
//        System.out.println("La fecha del Contacto es: "+ nombre1.getFechacontacto());
       
   //tarea 2
//   altaclientes nombre2=new altaclientes("", "", "", "", 46464646, 838383838, "22/10/2012");     
//        if (nombre2.getNombre() =="" || nombre2.getApellidopaterno()=="" || nombre2.getApellidomaterno()=="") {
//            System.out.println("Imposible dar de alta al cliente");
//            
//        }else{
//            System.out.println("cliente es: "+ nombre2.getNombre());
//        System.out.println("el apellido paterno es: "+nombre2.getApellidopaterno());
//        System.out.println("el apellido materno es: "+ nombre2.getApellidomaterno());
//        System.out.println("el mail es: "+ nombre2.getEmail());
//        System.out.println("el dni es: "+ nombre2.getDni());
//        System.out.println("el telefono es: "+ nombre2.getTelefono());
//        System.out.println("La fecha del Contacto es: "+ nombre2.getFechacontacto());
//        }
     altaclientes nombre2=new altaclientes("frank", "maura", "arias", "frank@gmail.com", 46464646, 838383838, "22/10/2012");  
//     altaclientes nombre3=new altaclientes("richard", "cueva", "ramirez", "richard@gmail.com", 222222, 33333, "02/11/2010");
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
