package entidade;

public abstract class Conteudo {
	private String titulo;
	private Integer likes;
	private Integer dislikes;
	private Categoria categoria;
	private Double duração;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Integer getDislikes() {
		return dislikes;
	}
	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Double getDuração() {
		return duração;
	}
	public void setDuração(Double duração) {
		this.duração = duração;
	}
	
	public Conteudo(String titulo, Integer likes, Integer dislikes, Categoria categoria, Double duração) {
		this.titulo = titulo;
		this.likes = likes;
		this.dislikes = dislikes;
		this.categoria = categoria;
		this.duração = duração;
	}
	
	public Conteudo() {
	}
	
	
	
	
}
