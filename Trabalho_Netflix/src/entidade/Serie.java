package entidade;

import java.util.ArrayList;

public class Serie extends Conteudo{

	ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
	
	public Serie() {
		super();
	}
	
	public Serie(String titulo, Double likes, Double dislikes, Categoria categoria, Integer duracao,
			String nomeProdutora, String classificacaoEtaria, ArrayList<Temporada> temporadas) {
		super(titulo, likes, dislikes, categoria, duracao, nomeProdutora, classificacaoEtaria);
		this.temporadas = temporadas;
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		for (Temporada temporada : temporadas) {
	           strb.append(temporada.toString());
	        }
		return "Série:\n"+ super.toString() + ", Duração = " + getDuracao() + " episódios" + strb.toString();
	}
	
}
	
	
