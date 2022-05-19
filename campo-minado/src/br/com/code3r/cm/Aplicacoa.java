package br.com.code3r.cm;

import br.com.code3r.cm.modelo.Tabuleiro;
import br.com.code3r.cm.visao.TabuleiroConsole;


public class Aplicacoa {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		
		new TabuleiroConsole(tabuleiro);
	}

}
