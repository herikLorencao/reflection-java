package br.com.alura.alurator.reflexao;

public class ManipuladorClasse {

	private Class<?> clazz;

	public ManipuladorClasse(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	public ManipuladorConstrutor getConstrutorPadrao() {
		try {
			return new ManipuladorConstrutor(clazz.getDeclaredConstructor());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
