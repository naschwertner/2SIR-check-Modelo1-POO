package br.fiapmusic.musica;

import br.fiapmusic.cantor.Cantor;

public class Musica {

	//Atributos privados
	private String titulo;
	private String genero;
	private Cantor cantor;
	private int total; 
	
	//metodo construtor
	public Musica(String titulo, String genero, Cantor cantor) {
		super(); //chamando o constutor da super classe
		this.titulo = titulo;
		this.genero = genero;
		this.cantor = cantor;
		//total nao entrou pq o valor inicial dele é 0
	}
	
	public String GetDados() {
		String aux ="";
		aux += "Título da música: " + titulo + "\n";
	    aux += "Gênero da música: " + genero + "\n";
	    aux += cantor.getDados(); //pegar os dados do cantor 
	    aux += "Total de execuções: " + total + "\n";
	    return aux;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Cantor getCantor() {
		return cantor;
	}

	public void setCantor(Cantor cantor) {
		this.cantor = cantor;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}
	
	

