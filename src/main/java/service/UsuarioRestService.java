package service;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import dao.FactoryDao;
import model.Usuario;


@Path("/usuario")
public class UsuarioRestService {

	@GET
	@Path("/retrieve")
	@Produces("application/json")
	public ArrayList<Usuario> retrieve() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = FactoryDao.getUsuariodao().retrieve();
		return usuarios;
	}

	@POST
	@Path("/create")
	@Consumes("application/json")
	@Produces("application/json")
	public Response create(Usuario usuario) {
		FactoryDao.getUsuariodao().create(usuario);
		return Response.ok().entity(new ServiceResponse(201,"Usuario Cadastrado")).build();
	}

	@DELETE
	@Path("/delete/{cpf}")
	@Produces("application/json")
	public Response delete(@PathParam("cpf") String cpf) {
		FactoryDao.getUsuariodao().delete(cpf);
		return Response.ok().entity(new ServiceResponse(200,"Usuario Excluído")).build();
	}

	@PUT
	@Path("/update/{cpf}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response update(@PathParam("cpf") String cpf,Usuario usuario) {
		FactoryDao.getUsuariodao().update(usuario);
		return Response.ok().entity(new ServiceResponse(200,"Usuario Atualizado")).build();
	}

}
