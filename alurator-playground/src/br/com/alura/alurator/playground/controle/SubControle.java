package br.com.alura.alurator.playground.controle;

public class SubControle extends Controle {
	private SubControle() {
	}
	
	private SubControle(String s) {
	}
	
	public void metodoSubControle1() {
		System.out.println("Executando método SubControle.metodo1");
	}
	
	private String metodoSubControle2() {
		System.out.println("Executando método SubControle.metodo2");
		return "retorno do método SubControle.metodo2";
	}
}
