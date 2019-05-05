/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario.Rol;
import static es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario.Rol.ADMINISTRADOR;
import static es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario.Rol.NORMAL;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author francis
 */
@Named(value = "login")
@RequestScoped
public class Login {

    private String usuario;
    private String contrasenia;
    private List<Usuario> usuarios;
    
    @Inject
    private ControlAutorizacion ctrl;

    /**
     * Creates a new instance of Login
     */
    public Login() {
        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("pepe", "asdf", Rol.NORMAL));
        usuarios.add(new Usuario("manolo", "qwer", Rol.ADMINISTRADOR));
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {
        // Implementar este método
        
        String mensaje = "";
        FacesContext ctx = FacesContext.getCurrentInstance();
        
        for(int i = 0; i < usuarios.size(); ++i) {
            
            if (usuarios.get(i).getUsuario().equals(usuario) && usuarios.get(i).getContrasenia().equals(contrasenia)) {
                
                if (usuarios.get(i).getRol().equals(ADMINISTRADOR)) {
                    
                    mensaje = "admin.xhtml";
                    
                } else if (usuarios.get(i).getRol().equals(NORMAL)) {
                    
                    mensaje = "normal.xhtml";
                    
                }
                
                ctrl.setUsuario(usuarios.get(i));
                
            }
            
        }
        
        if (mensaje.equals("")) {
                
                mensaje = "login.xhtml";
            
        }
        
        return mensaje;
    }
}
