package entidade;

import java.util.Comparator;

public class ContentSortById implements Comparator<Conteudo>{
	@Override
	public int compare(Conteudo o1, Conteudo o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}	
}
