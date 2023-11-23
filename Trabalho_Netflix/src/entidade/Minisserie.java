package entidade;

public class Minisserie extends Conteudo{
	private Integer numeroEpisodios;
	
	public Integer getNumeroEpisodios() {
		return numeroEpisodios;
	}

	public void setNumeroEpisodios(Integer numeroEpisodios) {
		this.numeroEpisodios = numeroEpisodios;
	}

	public Minisserie() {
		super();
	}

	public Minisserie(String titulo, Double likes, Double dislikes, Categoria categoria, Integer duracao, String nomeProdutora, String classificacaoEtaria, Integer numeroEpisodios) {
		super(titulo, likes, dislikes, categoria, duracao, nomeProdutora, classificacaoEtaria);
		this.numeroEpisodios = numeroEpisodios;
	}

	@Override
	public String toString() {
		return "Minissérie:\n" + super.toString() + ", Duração = " + getDuracao() + " minutos"+ ", Número de Episódios: " + numeroEpisodios;
	}
	
	
}
