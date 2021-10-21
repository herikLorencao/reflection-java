package br.com.alura.alurator.reflexao;

public class Reflexao {
	public ManipuladorClasse refleteClasse(String fullClassName) {
		try {
			var clazz = Class.forName(fullClassName);
			return new ManipuladorClasse(clazz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
