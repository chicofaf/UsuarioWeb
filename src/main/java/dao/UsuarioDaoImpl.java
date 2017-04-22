package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Usuario;

public class UsuarioDaoImpl implements UsuarioDao{

	public void create(Usuario usuario) {
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "insert into usuario(cpf, nome, sobrenome, login, senha) values (?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, usuario.getCpf().toString());
				ps.setString(2, usuario.getNome());
				ps.setString(3, usuario.getSobrenome());
				ps.setString(4, usuario.getLogin());
				ps.setString(5, usuario.getSenha());
				ps.execute();
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}

	}

	public void update(Usuario usuario) {

	}

	public List<Usuario> retrieve() {
		return null;
	}

	public void delete(Usuario usuario) {

	}
}
