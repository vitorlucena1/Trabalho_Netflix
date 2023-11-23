package entidade;

public class Administrador {
	private static String Senha = "admin";

	public static String getSenha() {
		return Senha;
	}

	public static void setSenha(String senha) {
		Senha = senha;
	}
	
	public Boolean confereSenha(String senha) {
		return senha.equals(getSenha());
	}
	
}
