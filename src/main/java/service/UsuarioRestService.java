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
		return Response.ok().entity(new ServiceResponse(201, "Usuario Cadastrado")).build();
	}

	@DELETE
	@Path("/delete/{cpf}")
	@Produces("application/json")
	public Response delete(@PathParam("cpf") String cpf) {
		FactoryDao.getUsuariodao().delete(cpf);
		return Response.ok().entity(new ServiceResponse(200, "Usuario Exclu�do")).build();
	}

	@PUT
	@Path("/update/{cpf}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response update(@PathParam("cpf") String cpf, Usuario usuario) {
		FactoryDao.getUsuariodao().update(usuario);
		return Response.ok().entity(new ServiceResponse(200, "Usuario Atualizado")).build();
	}

	@GET
	@Path("/help")
	public Response help() {
		String ajuda = "<H3>Servi�os dispon�veis para usuario:</H3> "
				+ "<BR> A cria��o de usu�rio � realizada atrav�s endere�o de requisi��o:"
				+ "<BR>http://localhost:8080/UsuarioWeb/service/usuario/create"
				+"<BR>Este servi�o consome um JSON com os dados do usu�rio e retorna uma resposta tamb�m em JSON"
				+ "<BR><BR> A atualiza��o de usu�rio � realizada atrav�s do endere�o de requisi��o:"
				+ "<BR>http://localhost:8080/UsuarioWeb/service/usuario/update/{cpf do usu�rio}"
				+"<BR>Este servi�o consome um JSON com os dados do usu�rio e retorna uma resposta tamb�m em JSON"
				+ "<BR><BR> A exclus�o de usu�rio � realizada atrav�s do endere�o de requisi��o:"
				+ "<BR>http://localhost:8080/UsuarioWeb/service/usuario/delete/{cpf do usu�rio}"
				+"<BR>Este servi�o apenas retorna um JSON."
				+ "<BR><BR> A listagem de todos os usu�rios � realizada atrav�s do endere�o de requisi��o:"
				+ "<BR>http://localhost:8080/UsuarioWeb/service/usuario/retrieve"
				+"<BR>Este servi�o retorna um JSON com todos os usu�rios cadastrados.";
		return Response.ok().entity(ajuda).build();
	}

}
