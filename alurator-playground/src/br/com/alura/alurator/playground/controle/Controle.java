package br.com.alura.alurator.playground.controle;

import java.util.List;

public class Controle {
	private List<String> lista = List.of("item 1", "item 2", "item 3");

	public Controle() {
	}

	private Controle(String s) {
	}

	private Controle(String s, String t) {
	}

	public List<String> getLista() {
		return lista;
	}

	public void metodoControle1() {
		System.out.println("Executando método Controle.metodo1");
	}

	private void metodoControle2() {
		System.out.println("Executando método Controle.metodo2");
	}
}
