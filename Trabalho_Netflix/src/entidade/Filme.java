package entidade;

public class Filme extends Conteudo{

	public Filme() {
		super();
	}

	public Filme(String titulo, Double likes, Double dislikes, Categoria categoria, Integer duracao, String nomeProdutora, String classificacaoEtaria) {
		super(titulo, likes, dislikes, categoria, duracao, nomeProdutora, classificacaoEtaria);
	}

	@Override
	public String toString() {
		return "Filme:\n" + super.toString() + ", Duração = " + getDuracao() + " minutos";
	}
	
}
