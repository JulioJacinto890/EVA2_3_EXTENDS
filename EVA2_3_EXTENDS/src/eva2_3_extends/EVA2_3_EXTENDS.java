/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author hp
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu1 = new Estudiante();
        estu1.setNombre("Julio");
        estu1.setApellido("Jacinto");
        estu1.setEdad(18);
        estu1.setNoControl(225500291);
        
         System.out.println(estu1.getNombre());
         System.out.println(estu1.getApellido());
         System.out.println(estu1.getEdad());
         System.out.println(estu1.getNoControl());
        
        
        probedores prove1=new probedores();
        
        prove1.setNombre("Juan");
        prove1.setApellido("Nose");
        prove1.setEdad(40);
        prove1.setRfc("Juan2984972");
        
        
        System.out.println(prove1.getNombre());
        System.out.println(prove1.getApellido());
        System.out.println(prove1.getEdad());
        System.out.println(prove1.getRfc());
    }
    
}
    
    

