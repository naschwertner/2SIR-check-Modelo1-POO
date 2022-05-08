package br.fiapmusic.playlist;

import br.fiapmusic.musica.Musica;

public class Playlist {

	// 2 atributos

	private Musica[] lista; // declaração de um vetor
	private int indice; //controla as posições do array

	
	//o metodo construtor deverá receber o tamanho do array lista e instancia-lo (no corpo o metodo)
	//não gerar o construtor pelo atalho nesse caso 
	
	public Playlist(int tamanho) {
		lista = new Musica[tamanho];
	}
	
	
	// 3. o metodo inserir() devera receber um objeto do tipo Musica e inserir no
	// array lista. O controle das posições do array
	public void inserir(Musica musica) { //recebendo o objeto do tipo musica
		if (indice < lista.length) {
			lista[indice++] = musica;
		}
	}

	// o metodo tocar() devera receber o titulo de uma musica e tocá-la no
	// dispositivo (apenas uma simulação, um faz de conta)
	// ao tocar a música, você deverá incrementar (em uma unidade) o atributo total da música tocada.
	public void tocar(String titulo) {
		int total;
		for (int i = 0; i < indice; i++) {
			if (lista[i].getTitulo().equalsIgnoreCase(titulo)) { //comparação de string 
				total = lista[i].getTotal(); 
				lista[i].setTotal(total + 1); //somar 1 no total da musica
			}
		}
	}

	// metodo listar() deverá retornar os dados de todas as músicas da playlist
	public String listar() {
		String aux = "";
		for(int i = 0; i < indice; i++) {
			aux += lista[i].GetDados() + "\n";
		}
		return aux;
	}

}
