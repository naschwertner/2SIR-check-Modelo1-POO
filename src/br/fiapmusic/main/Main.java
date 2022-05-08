package br.fiapmusic.main;

import br.fiapmusic.cantor.Cantor;
import br.fiapmusic.musica.Musica;
import br.fiapmusic.playlist.Playlist;

public class Main {

	public static void main(String[] args) {
		
		//6. (2,0) Instanciar uma playlist e, em seguida, gerar 4 (quatro) objetos do tipo Musica e inserir na playlist. 
		Playlist play = new Playlist(4);
		
		//lembrete: exercicio pedia apenas 4 musicas, aqui foi criado 4 cantores opcionalmente 
		Cantor cantor1 = new Cantor("Selmini");
		Cantor cantor2 = new Cantor("Patricia", "Inglesa");
		Cantor cantor3 = new Cantor("Renato");
		Cantor cantor4 = new Cantor("Agessandro", "Brasileiro");
		
		//A forma de gera��o dos objetos fica a seu crit�rio (voc� pode utilizar entrada de dados via Scanner ou 
		//JOptionPane ou at� mesmo definir os valores dos atributos). 
				
		//cria��o dos 4 objetos do tipo musica
		Musica musica1 = new Musica("titulo1", "forr�", cantor1);
		Musica musica2 = new Musica("titulo2", "samba", cantor2);
		Musica musica3 = new Musica("titulo3", "pagode",cantor3);
		Musica musica4 = new Musica("titulo4", "rock",  cantor4);
		
		play.inserir(musica1);
		play.inserir(musica2);
		play.inserir(musica3);
		play.inserir(musica4);
		
		//7. (2,0) Tocar pelo menos duas m�sicas da playlist (voc� decide no seu c�digo qual ser� tocada, fica a seu 
		//crit�rio). 
		play.tocar("titulo1");
		play.tocar("titulo2");
		
		//8. (1,0) Imprimir no v�deo os dados de todas as m�sicas armazenadas na playlist. 
		System.out.print(play.listar());
		
	}

}
