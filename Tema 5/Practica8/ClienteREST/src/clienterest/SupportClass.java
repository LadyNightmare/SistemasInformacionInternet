/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienterest;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:application
 * [agenda/contactos]<br>
 * USAGE:
 * <pre>
 *        SupportClass client = new SupportClass();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author ladynightmare
 */
public class SupportClass {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://www.francisco.chicano.es/AgendaEE-war/rs/";

    public SupportClass() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("agenda/contactos");
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)@param user_auth header parameter[REQUIRED]
     */
    public <T> T getContactos_TEXT_XML(Class<T> responseType, String user_auth) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).header("User-auth", user_auth).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)@param user_auth header parameter[REQUIRED]
     */
    public <T> T getContactos_XML(Class<T> responseType, String user_auth) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).header("User-auth", user_auth).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)@param user_auth header parameter[REQUIRED]
     */
    public <T> T getContactos_JSON(Class<T> responseType, String user_auth) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).header("User-auth", user_auth).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param requestEntity request data@return response object (instance of responseType class)@param user_auth header parameter[REQUIRED]
     */
    public <T> T postContacto_JSON(Object requestEntity, Class<T> responseType, String user_auth) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).header("User-auth", user_auth).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param requestEntity request data@return response object (instance of responseType class)@param user_auth header parameter[REQUIRED]
     */
    public <T> T postContacto_XML(Object requestEntity, Class<T> responseType, String user_auth) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).header("User-auth", user_auth).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param requestEntity request data@return response object (instance of responseType class)@param user_auth header parameter[REQUIRED]
     */
    public <T> T postContacto_TEXT_XML(Object requestEntity, Class<T> responseType, String user_auth) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).header("User-auth", user_auth).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.TEXT_XML), responseType);
    }

    public void close() {
        client.close();
    }
    
}
