package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import model.Usuario;

@Path("/usuario")
public class UsuarioRestService {
	
	@GET
	@Path("/listar/{nome}")
	@Produces("application/json")
	//@Formatted
	public Response listar(@PathParam("nome") String nome) {
		Usuario usuario = new Usuario("08088", nome, "da Silva", "loginsdsd", "1234");
		return Response.status(200).entity(usuario).build();
	}

	@POST
	@Path("/create")
	@Consumes("application/json")
	@Produces("application/json")
	public Response create(Usuario usuario) {
		//String output = usuario.toString();
		return Response.status(200).entity(usuario).build();
	}
	
	
	@DELETE
	@Path("/delete")
	@Consumes("application/json")
	public Response delete(Usuario usuario) {
		//String output = usuario.toString();
		return Response.status(200).entity(usuario).build();
	}
	
	@PUT
	@Path("/update")
	@Consumes("application/json")
	public Response update(Usuario usuario) {
		//String output = usuario.toString();
		return Response.status(200).entity(usuario).build();
	}

}
