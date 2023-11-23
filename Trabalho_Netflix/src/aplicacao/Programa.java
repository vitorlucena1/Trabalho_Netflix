package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import entidade.Administrador;
import entidade.Catalogo;
import entidade.Categoria;
import entidade.Conteudo;
import entidade.Curta;
import entidade.Minisserie;
import entidade.Serie;
import entidade.Temporada;
import entidade.Usuario;
import entidade.Filme;

public class Programa {

	public static void main(String[] args) {

		Catalogo conteudos = new Catalogo();
		
		Usuario usuario = new Usuario();
		
		ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
		
		//Criação dos Filmes
		conteudos.addConteudo(new Filme("Rambo: Programado Para Matar", 700.0, 300.0, Categoria.ACAO, 93, "Carolco Pictures", "14"));
		conteudos.addConteudo(new Filme("O Poderoso Chefão", 1000.0, 500.0, Categoria.DRAMA, 175, "Paramount Pictures", "14"));
		conteudos.addConteudo(new Filme("Jurassic Park", 800.0, 400.0, Categoria.AVENTURA, 127, "Universal Pictures", "12"));
		conteudos.addConteudo(new Filme("Matrix", 750.0, 350.0, Categoria.FICCAO, 136, "Warner Bros", "14"));
		conteudos.addConteudo(new Filme("Titanic", 950.0, 450.0, Categoria.ROMANCE, 194, "20th Century Fox", "12"));
		conteudos.addConteudo(new Filme("Toy Story", 300.0, 373.0, Categoria.ANIMACAO, 81, "Pixar Animation Studios", "AL"));
		conteudos.addConteudo(new Filme("O Iluminado", 190.0, 45.0, Categoria.TERROR, 146, "Warner Bros.", "14"));
		
		//Criação dos Curtas
		conteudos.addConteudo(new Curta("Olaf's Frozen Adventure", 300.0, 150.0, Categoria.ANIMACAO, 22, "Walt Disney Studios Motion Pictures", "AL"));
		conteudos.addConteudo(new Curta("Frozen: Febre Congelante", 260.0, 80.0, Categoria.ANIMACAO, 8, "Walt Disney Studios Motion Pictures", "AL"));
		conteudos.addConteudo(new Curta("Enrolados para Sempre", 320.0, 90.0, Categoria.ANIMACAO, 6, "Walt Disney Studios Motion Pictures", "AL"));
		conteudos.addConteudo(new Curta("Lava", 200.0, 60.0, Categoria.ANIMACAO, 7, "Walt Disney Studios Motion Pictures", "AL"));
		conteudos.addConteudo(new Curta("A Voz Humana", 180.0, 22.0, Categoria.DRAMA, 30, "Sony Pictures Classics", "18"));
		conteudos.addConteudo(new Curta("Umbrella", 300.0, 40.0, Categoria.DRAMA, 8, "Stratostorm Studio", "AL"));
		conteudos.addConteudo(new Curta("Tiro Certeiro", 205.0, 20.0, Categoria.DRAMA, 19, "Story Ink", "14"));

		//Criação das Minisséries
		conteudos.addConteudo(new Minisserie("Neymar: O Caos Perfeito", 650.0, 300.0, Categoria.DOCUMENTARIO, 165, "Netflix", "14", 3));
		conteudos.addConteudo(new Minisserie("Beckham", 700.0, 250.0, Categoria.DOCUMENTARIO, 165, "Netflix", "14", 5));
		
		//Criação das Séries
		conteudos.addConteudo(new Serie("Flash", 6000.0, 1800.0, Categoria.ACAO, 184, "CW", "14", new ArrayList<Temporada>(Arrays.asList(new Temporada(23,1), new Temporada(22, 2), new Temporada(22, 3), new Temporada(22, 4), new Temporada(21, 5), new Temporada(18, 6), new Temporada(17, 7), new Temporada(19, 8), new Temporada(13, 9)))));
		
		//Ordenação do Catálogo por Ordem Alfabética do Título do Conteúdo
		conteudos.ordenaCatalogo();

		Scanner sc = new Scanner(System.in);
		
		//Criação da variável senha para verificar quando for administrador
		String senha;
		
		Integer opcao=0;
		
		//Criação da variável usuarioOuAdmin para identificar quando for administrador ou usuário
		Integer usuarioOuAdmin;
		
		do{
			System.out.println("***MENU***");
			System.out.println("1 - Usuário");	
			System.out.println("2 - Administrador");
			do {
				usuarioOuAdmin = sc.nextInt();
				if(usuarioOuAdmin!=1 && usuarioOuAdmin !=2) {
				System.out.println("Opção Inválida!\nDigite novamente");
				System.out.println("***MENU***");
				System.out.println("1 - Usuário");
				System.out.println("2 - Administrador");
				}

			} while (usuarioOuAdmin!=1 && usuarioOuAdmin !=2);
			
			if(usuarioOuAdmin == 1) {
				System.out.println("***MENU***");
				System.out.println("1 - Adicionar Conteúdo à sua lista");
				System.out.println("2 - Remover Conteúdo da sua lista");
				System.out.println("3 - Pesquisar títulos disponíveis no catálogo");
				System.out.println("4 - Pesquisar título na minha lista");
				System.out.println("5 - Exibir conteúdo da minha lista");
				System.out.println("6 - Sair");
				opcao = sc.nextInt();
				
				//Limpar o Buffer
				sc.nextLine();
				
				if(opcao == 1) {
					System.out.print("Digite o conteúdo a ser adicionado à sua lista: ");
					String titulo = sc.nextLine();
					if(conteudos.pesquisarConteudoNoCatalogo(titulo) != null)
							usuario.adicionarMinhaLista(conteudos.pesquisarConteudoNoCatalogo(titulo));
					else 
						System.out.println("Título não encontrado");
				}
				
				else if(opcao == 2) {
					System.out.print("Digite o conteúdo a ser removido da sua lista: ");
					String titulo = sc.nextLine();
					if(usuario.pesquisarConteudoNaLista(titulo) != null)
							usuario.removerMinhaLista(usuario.pesquisarConteudoNaLista(titulo));
					else 
						System.out.println("Título não encontrado");
				}
				
				else if(opcao == 3) {
					System.out.print("Digite o título do conteúdo a ser pesquisado no catálogo: ");
					String titulo = sc.nextLine();
					if(conteudos.pesquisarConteudoNoCatalogo(titulo) != null)
						System.out.println(conteudos.pesquisarConteudoNoCatalogo(titulo));
					else 
						System.out.println("Conteúdo não encontrado");
				}
				
				else if(opcao == 4) {
					System.out.print("Digite o título do conteúdo a ser pesquisado na sua lista: ");
					String titulo = sc.nextLine();
					if(usuario.pesquisarConteudoNaLista(titulo) != null)
						System.out.println(usuario.pesquisarConteudoNaLista(titulo));
					else 
						System.out.println("Conteúdo não encontrado");
				}
				
				else if(opcao == 5) {
					System.out.println("Minha Lista:");
					System.out.println(usuario.retornaMinhaLista());;
				}
				
			}
			
			else if(usuarioOuAdmin == 2) {
				Administrador admin = new Administrador();
				
				//Limpar o Buffer
				sc.nextLine();
				
				do {
					System.out.print("Digite a senha de administrador: ");
					senha = sc.nextLine();
					
					if(!admin.confereSenha(senha)) 
						System.out.println("Senha Incorreta!\nDigite a senha novamente.");
			
				} while (!admin.confereSenha(senha));
				
				System.out.println("***MENU***");
				System.out.println("1 - Adicionar Conteúdo ao catálogo");
				System.out.println("2 - Remover Conteúdo do catálogo");
				System.out.println("3 - Pesquisar título");
				System.out.println("4 - Exibir Conteúdo");
				System.out.println("5 - Sair");
				opcao = sc.nextInt();
				
				//Limpar o Buffer
				sc.nextLine();
				
				if(opcao == 1) {
					Integer tipoConteudo;
					do {
						System.out.println("Digite o conteúdo a ser adicionado ao catálogo: ");
						System.out.println("1 - Filme");
						System.out.println("2 - Série");
						System.out.println("3 - Minissérie");
						System.out.println("4 - Curta");
						tipoConteudo = sc.nextInt();
						if(tipoConteudo!= 1 && tipoConteudo!= 2 && tipoConteudo!= 3 && tipoConteudo!= 4)
							System.out.println("Opção Inválida!\nDigite novamente");
					} while (tipoConteudo!= 1 && tipoConteudo!= 2 && tipoConteudo!= 3 && tipoConteudo!= 4);
					
					//Limpar o Buffer
					sc.nextLine();
					
					if(tipoConteudo == 1) {
						String titulo;
						Categoria categoria;
						Integer duracao;
						String nomeProdutora;
						String classificacaoEtaria;
						
						System.out.print("Digite o título: ");
						titulo = sc.nextLine();
						
						System.out.print("Digite a categoria (ACAO, COMEDIA, DRAMA, SUSPENSE, TERROR, ROMANCE, FICCAO, AVENTURA, ANIMACAO, POLICIAL, DOCUMENTARIO): ");
						categoria = Categoria.valueOf(sc.next().toUpperCase());
						
						System.out.print("Digite a duração em minutos: ");
						duracao = sc.nextInt();
						
						//Limpar o Buffer
						sc.nextLine();
						
						System.out.print("Digite a nome da produtora: ");
						nomeProdutora = sc.nextLine();
						
						System.out.print("Digite a classificação etária: ");
						classificacaoEtaria = sc.next();
						
						conteudos.addConteudo(new Filme(titulo, 0.0, 1.0, categoria, duracao, nomeProdutora, classificacaoEtaria));
					}
					
					else if(tipoConteudo == 2) {
						String titulo;
						Categoria categoria;
						Integer duracao;
						String nomeProdutora;
						String classificacaoEtaria;
						
						System.out.print("Digite o título: ");
						titulo = sc.nextLine();
						
						System.out.print("Digite a categoria (ACAO, COMEDIA, DRAMA, SUSPENSE, TERROR, ROMANCE, FICCAO, AVENTURA, ANIMACAO, POLICIAL, DOCUMENTARIO): ");
						categoria = Categoria.valueOf(sc.next().toUpperCase());
						
						System.out.print("Digite o total de episódios: ");
						duracao = sc.nextInt();
						
						//Limpar o Buffer
						sc.nextLine();
						
						System.out.print("Digite a nome da produtora: ");
						nomeProdutora = sc.nextLine();
						
						System.out.print("Digite a classificação etária: ");
						classificacaoEtaria = sc.next();
						
						System.out.print("Digite a quantidade de temporadas: ");
						Integer quantTemporadas = sc.nextInt();
						
						for(int i = 0; i<quantTemporadas; i++) {
							System.out.print("Digite a quantidade de episódios da temporada " + (i+1) + ": ");
							Integer quantEpisodios = sc.nextInt();
							temporadas.add(new Temporada(quantEpisodios, (i+1)));
						}
						
						conteudos.addConteudo(new Serie(titulo, 0.0, 1.0, categoria, duracao, nomeProdutora, classificacaoEtaria, temporadas));
					}
					
					else if(tipoConteudo == 3) {
						String titulo;
						Categoria categoria;
						Integer duracao;
						String nomeProdutora;
						String classificacaoEtaria;
						
						System.out.print("Digite o título: ");
						titulo = sc.nextLine();
						
						System.out.print("Digite a categoria (ACAO, COMEDIA, DRAMA, SUSPENSE, TERROR, ROMANCE, FICCAO, AVENTURA, ANIMACAO, POLICIAL, DOCUMENTARIO): ");
						categoria = Categoria.valueOf(sc.next().toUpperCase());
						
						System.out.print("Digite a duração em minutos: ");
						duracao = sc.nextInt();
						
						//Limpar o Buffer
						sc.nextLine();
						
						System.out.print("Digite a nome da produtora: ");
						nomeProdutora = sc.nextLine();
						
						System.out.print("Digite a classificação etária: ");
						classificacaoEtaria = sc.next();
						
						System.out.print("Digite o número de episódios: ");
						Integer quantEpisodios = sc.nextInt();
						
						conteudos.addConteudo(new Minisserie(titulo, 0.0, 1.0, categoria, duracao, nomeProdutora, classificacaoEtaria, quantEpisodios));
					}
					
					else if(tipoConteudo == 4) {
						String titulo;
						Categoria categoria;
						Integer duracao;
						String nomeProdutora;
						String classificacaoEtaria;
						
						System.out.print("Digite o título: ");
						titulo = sc.nextLine();
						
						System.out.print("Digite a categoria (ACAO, COMEDIA, DRAMA, SUSPENSE, TERROR, ROMANCE, FICCAO, AVENTURA, ANIMACAO, POLICIAL, DOCUMENTARIO): ");
						categoria = Categoria.valueOf(sc.next().toUpperCase());
						
						System.out.print("Digite a duração em minutos: ");
						duracao = sc.nextInt();
						
						//Limpar o Buffer
						sc.nextLine();
						
						System.out.print("Digite a nome da produtora: ");
						nomeProdutora = sc.nextLine();
						
						System.out.print("Digite a classificação etária: ");
						classificacaoEtaria = sc.next();
						
						conteudos.addConteudo(new Curta(titulo, 0.0, 1.0, categoria, duracao, nomeProdutora, classificacaoEtaria));
					}
				}
				
				else if(opcao == 2) {
						System.out.print("Digite o título do conteúdo a ser removido: ");
						String titulo = sc.nextLine();
						
						if(conteudos.pesquisarConteudoNoCatalogo(titulo) != null) {
							conteudos.removeConteudo(conteudos.pesquisarConteudoNoCatalogo(titulo));
							usuario.removerMinhaLista(usuario.pesquisarConteudoNaLista(titulo));
						}
						else 
							System.out.println("Título não encontrado");
				}
				
				else if(opcao == 3) {
					System.out.print("Digite o título do conteúdo a ser pesquisado: ");
					String titulo = sc.nextLine();
					
					if(conteudos.pesquisarConteudoNoCatalogo(titulo) != null)
						System.out.println(conteudos.pesquisarConteudoNoCatalogo(titulo));
					else 
						System.out.println("Conteúdo não encontrado");
				}
				
				else if(opcao == 4) {
					System.out.println(conteudos.retornaConteudo());
				}
				
			}
			conteudos.ordenaCatalogo();
			usuario.ordenaMinhaLista();
		}while((opcao!=5 && usuarioOuAdmin==2) || (opcao!=6 && usuarioOuAdmin==1));
	
		sc.close();

	}

}
