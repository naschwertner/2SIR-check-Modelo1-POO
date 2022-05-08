package br.fiapmusic.playlist;

import br.fiapmusic.musica.Musica;

public class Playlist {

	// 2 atributos

	private Musica[] lista; // declara��o de um vetor
	private int indice; //controla as posi��es do array

	
	//o metodo construtor dever� receber o tamanho do array lista e instancia-lo (no corpo o metodo)
	//n�o gerar o construtor pelo atalho nesse caso 
	
	public Playlist(int tamanho) {
		lista = new Musica[tamanho];
	}
	
	
	// 3. o metodo inserir() devera receber um objeto do tipo Musica e inserir no
	// array lista. O controle das posi��es do array
	public void inserir(Musica musica) { //recebendo o objeto do tipo musica
		if (indice < lista.length) {
			lista[indice++] = musica;
		}
	}

	// o metodo tocar() devera receber o titulo de uma musica e toc�-la no
	// dispositivo (apenas uma simula��o, um faz de conta)
	// ao tocar a m�sica, voc� dever� incrementar (em uma unidade) o atributo total da m�sica tocada.
	public void tocar(String titulo) {
		int total;
		for (int i = 0; i < indice; i++) {
			if (lista[i].getTitulo().equalsIgnoreCase(titulo)) { //compara��o de string 
				total = lista[i].getTotal(); 
				lista[i].setTotal(total + 1); //somar 1 no total da musica
			}
		}
	}

	// metodo listar() dever� retornar os dados de todas as m�sicas da playlist
	public String listar() {
		String aux = "";
		for(int i = 0; i < indice; i++) {
			aux += lista[i].GetDados() + "\n";
		}
		return aux;
	}

}
