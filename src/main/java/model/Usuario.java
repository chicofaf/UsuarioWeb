package model;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name = "cpf")
	private String cpf;
	
	@XmlElement(name = "nome")
	private String nome;
	
	@XmlElement(name = "sobrenome")
	private String sobrenome;
	
	@XmlElement(name = "login")
	private String login;
	  
	@XmlElement(name = "senha")
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
