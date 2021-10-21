package br.com.alura.alurator.protocolo;

public class Request {

	private String nomeController;
	private String nomeMetodo;

	public Request(String url) {
		String[] partesUrl = url.replaceFirst("/", "").split("/");
		nomeController = Character.toUpperCase(partesUrl[0].charAt(0)) + partesUrl[0].substring(1) + "Controller";

		nomeMetodo = partesUrl[1];
	}

	public String getNomeController() {
		return nomeController;
	}

	public String getNomeMetodo() {
		return nomeMetodo;
	}
}
