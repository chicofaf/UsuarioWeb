package model;

public class Usuario {
	
	private String cpf;
	private String nome;
	private String sobrenome;
	private String login;
	private String senha;
	
	public Usuario(String cpf, String nome, String sobrenome, String login, String senha) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario(){
		//this();
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome + ", login=" + login + ", senha="
				+ senha + "]";
	}
		
}
