/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienterest;

import java.util.List;

/**
 *
 * @author ladynightmare
 */
public class ClienteREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SupportClass sup = new SupportClass();
        
        Usuario u = sup.getContactos_JSON(Usuario.class, "ladynightmare2:holahola");
        List<Contacto> contactos = u.getContactos();
        
        System.out.println("Los contactos del usuario \"" + u.getNombre() + "\" son: ");
        for (Contacto c : contactos) {
            
            System.out.println(c.getNombre() + "\t" + c.getEmail() + "\t" + c.getTelefono());
            
        }
        
    }
    
}
