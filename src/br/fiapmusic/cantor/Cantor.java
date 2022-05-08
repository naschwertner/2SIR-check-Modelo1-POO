package br.fiapmusic.cantor;

public class Cantor {
     
	//Atributos privados
	private String nome;
	private String nacionalidade;
	
	//metodo construtor (nesse caso com sobrecarga pois possue 2 metodos)
	public Cantor(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public Cantor(String nome) {
		super();
		this.nome = nome;
	}
	
	//Método get para retornar dados (do cantor)
	public String getDados() {
		String aux = "";
		aux +="Nome: " + nome + "\n";
		aux += "Nacionalidade: " + nacionalidade + "\n";
		return aux;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	
	
	
}
