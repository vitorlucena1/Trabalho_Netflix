package entidade;


public class Temporada {
	
	private Integer numeroDeEpisodios;
	private Integer numeroDaTemporada;
	
	public Temporada() {
		
	}

	public Temporada(Integer numeroDeEpisodios, Integer numeroDaTemporada) {
		this.numeroDeEpisodios = numeroDeEpisodios;
		this.numeroDaTemporada = numeroDaTemporada;
	}

	public Integer getNumeroDeEpisodios() {
		return numeroDeEpisodios;
	}

	public void setNumeroDeEpisodios(Integer numeroDeEpisodios) {
		this.numeroDeEpisodios = numeroDeEpisodios;
	}

	public Integer getNumeroDaTemporada() {
		return numeroDaTemporada;
	}

	public void setNumeroDaTemporada(Integer numeroDaTemporada) {
		this.numeroDaTemporada = numeroDaTemporada;
	}

	@Override
	public String toString() {
		return ", Temporada: " + numeroDaTemporada + " - Número de Episódios: "+ numeroDeEpisodios;
	}
	
}
