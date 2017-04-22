package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "update usuario set nome = ?, sobrenome = ?, login = ?, senha = ? where cpf = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, usuario.getNome());
				ps.setString(2, usuario.getSobrenome());
				ps.setString(3, usuario.getLogin());
				ps.setString(4, usuario.getSenha());
				ps.setString(5, usuario.getCpf());
				ps.executeUpdate();
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}
	}
	

	public ArrayList<Usuario> retrieve() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "select * from usuario";
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()){
					Usuario usuario = new Usuario();
					usuario.setCpf(rs.getString("cpf"));
					usuario.setNome(rs.getString("nome"));
					usuario.setSobrenome(rs.getString("sobrenome"));
					usuario.setLogin(rs.getString("login"));
					usuario.setSenha(rs.getString("senha"));
					usuarios.add(usuario);
				}
				return usuarios;
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}
		return usuarios;
	}

	public void delete(String cpf) {
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "delete from usuario where cpf = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, cpf);
				ps.executeUpdate();
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}
	}
}
