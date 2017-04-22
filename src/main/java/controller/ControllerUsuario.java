package controller;

import dao.FactoryDao;
import model.Usuario;

public class ControllerUsuario {
	public static void create(Usuario usuario) {
		FactoryDao.getUsuariodao().create(usuario);
	}
}
