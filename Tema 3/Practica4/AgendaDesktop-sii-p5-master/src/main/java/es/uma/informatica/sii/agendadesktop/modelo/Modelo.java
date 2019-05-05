/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.agendadesktop.modelo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author francis
 */
public class Modelo {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public Modelo()
    {
        emf = Persistence.createEntityManagerFactory("AgendaPU");
        em = emf.createEntityManager();
    }
    
    public boolean aniadirContacto (Contacto c)
    {
        
        boolean added = false;
        
        if(!em.contains(c)) {
            
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(c);
            tx.commit();
            added = true;
            
        }      
        
        
        return added;
    }
    
    public void modificarContacto (Contacto c)
    {
        
            if(!em.contains(c)) {
            
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.refresh(c);
            tx.commit();
            
        }  
        
    }
    
    public void eliminarContacto (Contacto c)
    {
        if(!em.contains(c)) {
            
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.remove(c);
            tx.commit();
            
        } 
    }
    
    public List<Contacto> getContactos()
    {
        // TODO: Insertar código para devolver todos los contactos de la BBDD (se puede hacer en 3 líneas contando las que ya hay)
        List<Contacto> res = null;
        
        res.add(em.find(Contacto.class,1L));
        
        return res;
    }
    
    public void cerrar()
    {
        em.close();
        emf.close();
    }
    
    
}
