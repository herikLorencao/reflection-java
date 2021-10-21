package br.com.alura.alurator;

import br.com.alura.alurator.protocolo.Request;
import br.com.alura.alurator.reflexao.Reflexao;

public class Alurator {

	private String pacoteBase;

	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}

	public Object executa(String url) {
		var request = new Request(url);
		String fullClassName = pacoteBase + request.getNomeController();

		var instanciaControle = new Reflexao().refleteClasse(fullClassName).getConstrutorPadrao().invoca();
		System.out.println(instanciaControle);

		return null;
	}
}
