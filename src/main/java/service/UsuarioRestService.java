package service;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import model.Usuario;

@Path("/usuario")
public class UsuarioRestService {
	
	@GET
	@Path("/printmsg/{msg}")
	public Response printMessage(@PathParam("msg") String msg){
		String result = "A mensagem enviada foi: " + msg;
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/create")
	@Consumes("application/json")
	public Response create(Usuario usuario){
		String result = usuario.toString();
		return Response.status(200).entity(result).build();
	}
}
