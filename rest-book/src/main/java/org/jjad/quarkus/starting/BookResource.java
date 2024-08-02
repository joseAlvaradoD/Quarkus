package org.jjad.quarkus.starting;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jjad.quarkus.starting.model.Usuario;

import java.util.List;

@Path("/api/books")
public class BookResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String hello(){
        Usuario.builder().usuario("jjad").build().persist();
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @Path("/{usuario}")
    public Usuario getUsuario(@PathParam("usuario") String usuario){
        return Usuario.builder().usuario(usuario).build().findByUsuario(usuario);
    }
}
