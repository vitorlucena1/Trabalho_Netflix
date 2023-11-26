package entidade;

public class Administrador {
	private final String senha = "admin";

	public String getSenha() {
		return senha;
	}

	public Boolean confereSenha(String senha) {
		return senha.equals(getSenha());
	}
	
}
