package entidade;

import java.util.ArrayList;
import java.util.Collections;

public class Catalogo {

	private ArrayList<Conteudo> catalogo = new ArrayList<Conteudo>();
	
	public void addConteudo(Conteudo c) {
		catalogo.add(c);
	}
	
	public void removeConteudo(Conteudo c) {
		catalogo.remove(c);
	}
	
	public Conteudo pesquisarConteudoNoCatalogo(String nome) {
		for(Conteudo conteudo : catalogo) {
			if(conteudo.getTitulo().equalsIgnoreCase(nome)) return conteudo;
		}
		return null;
	}
	
	public String retornaConteudo() {
		StringBuilder strb = new StringBuilder();
		for(Conteudo conteudo : catalogo) {
			strb.append("\n"+conteudo.toString() + "\n");
		}
		return strb.toString();
	}
	
	public void ordenaCatalogo() {
		Collections.sort(catalogo, new ContentSortById());
	}
	
}
