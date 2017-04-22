package dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDao {
	public void create (Usuario usuario);
	public void update(Usuario usuario);
	public List<Usuario> retrieve();
	public void delete(Usuario usuario);
}
