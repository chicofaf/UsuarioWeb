package dao;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public interface UsuarioDao {
	public void create (Usuario usuario);
	public void update(Usuario usuario);
	public ArrayList<Usuario> retrieve();
	public void delete(String cpf);
}
