package entidade;

import java.util.ArrayList;

public abstract class Conteudo implements Relevancia{
	private String titulo;
	private Double likes;
	private Double dislikes;
	private Categoria categoria;
	private Integer duracao;
	private String nomeProdutora;
	private String classificacaoEtaria;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getLikes() {
		return likes;
	}
	public void setLikes(Double likes) {
		this.likes = likes;
	}
	public Double getDislikes() {
		return dislikes;
	}
	public void setDislikes(Double dislikes) {
		this.dislikes = dislikes;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public String getNomeProdutora() {
		return nomeProdutora;
	}
	public void setNomeProdutora(String nomeProdutora) {
		this.nomeProdutora = nomeProdutora;
	}
	public String getClassificacaoEtaria() {
		return classificacaoEtaria;
	}
	public void setClassificacaoEtaria(String classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}
	
	public Conteudo(String titulo, Double likes, Double dislikes, Categoria categoria, Integer duracao, String nomeProdutora, String classificacaoEtaria) {
		this.titulo = titulo;
		this.likes = likes;
		this.dislikes = dislikes;
		this.categoria = categoria;
		this.duracao = duracao;
		this.nomeProdutora = nomeProdutora;
		this.classificacaoEtaria = classificacaoEtaria;
	}
	
	public Conteudo() {
	}
	
	@Override
	public Double avaliacao() {
		return 100*(getLikes()/(getLikes()+getDislikes()));
	}
	
	public Boolean pesquisar(ArrayList<Conteudo> conteudos, String titulo) {
		for(Conteudo c : conteudos) {
			if(titulo.equalsIgnoreCase(c.getTitulo()))
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Titulo = " + titulo + ", Likes = " + likes + ", Dislikes = " + dislikes + String.format(", Avaliação = %.2f", avaliacao()) +"%, Categoria = " + categoria
				+ ", Nome da Produtora = " + nomeProdutora + ", Classificação Etária = "
				+ classificacaoEtaria;
	}
	
}
