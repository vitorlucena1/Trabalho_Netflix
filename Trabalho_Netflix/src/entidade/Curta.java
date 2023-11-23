package entidade;

public class Curta extends Conteudo{

	public Curta() {
		super();
	}

	public Curta(String titulo, Double likes, Double dislikes, Categoria categoria, Integer duracao, String nomeProdutora, String classificacaoEtaria) {
		super(titulo, likes, dislikes, categoria, duracao, nomeProdutora, classificacaoEtaria);
	}


	@Override
	public String toString() {
		return "Curta:\n" + super.toString() + ", Duração = " + getDuracao() + " minutos";
	}
}
