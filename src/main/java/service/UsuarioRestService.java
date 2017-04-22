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

import controller.ControllerUsuario;
import model.Usuario;


@Path("/usuario")
public class UsuarioRestService {

	@GET
	@Path("/retrieve/{nome}")
	@Produces("application/json")
	public Response retrieve(@PathParam("nome") String nome) {
		Usuario usuario = new Usuario("11111111111", nome, "da Silva", "loginsdsd", "1234");
		return Response.status(Response.Status.OK).entity(usuario).build();
	}

	@POST
	@Path("/create")
	@Consumes("application/json")
	@Produces("application/json")
	public Response create(Usuario usuario) {
		ControllerUsuario.create(usuario);
		return Response.ok().entity(new ServiceResponse(201,"Usuario Cadastrado")).build();
	}

	@DELETE
	@Path("/delete")
	@Consumes("application/json")
	public Response delete(Usuario usuario) {
		return Response.status(Response.Status.OK).entity(usuario).build();
	}

	@PUT
	@Path("/update")
	@Consumes("application/json")
	public Response update(Usuario usuario) {
		return Response.status(Response.Status.OK).entity(usuario).build();
	}

}
