package dao;

public class FactoryDao {
	
	
	public static UsuarioDao getUsuariodao(){
		return new UsuarioDaoImpl();
	}
}
