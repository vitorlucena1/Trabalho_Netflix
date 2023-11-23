package entidade;

import java.util.ArrayList;
import java.util.Collections;

public class Usuario {
	
	private ArrayList<Conteudo> minhaLista = new ArrayList<Conteudo>();
	
	public ArrayList<Conteudo> getMinhaLista() {
		return minhaLista;
	}

	public void setMinhaLista(ArrayList<Conteudo> minhaLista) {
		this.minhaLista = minhaLista;
	}
	
	public Conteudo pesquisarConteudoNaLista(String nome) {
		for(Conteudo conteudo : minhaLista) {
			if(conteudo.getTitulo().equalsIgnoreCase(nome)) return conteudo;
		}
		return null;
	}
	
	public void adicionarMinhaLista(Conteudo conteudo) {
		minhaLista.add(conteudo);
	}
	
	public void removerMinhaLista(Conteudo conteudo) {
		minhaLista.remove(conteudo);
	}

	public String retornaMinhaLista() {
		StringBuilder strb = new StringBuilder();
		for(Conteudo conteudo : minhaLista) {
			strb.append(conteudo.toString() + "\n");
		}
		return strb.toString();
	}
	
	public void ordenaMinhaLista() {
		Collections.sort(minhaLista, new ContentSortById());
	}
	
}
