package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<SubControle> subControleClasse1 = SubControle.class;

		Class<?> subControleClasse2 = Class.forName("br.com.alura.alurator.playground.controle.SubControle");
		Class<?> controleClasse1 = Class.forName("br.com.alura.alurator.playground.controle.Controle");

		Constructor<SubControle> construtorSubControle = subControleClasse1.getDeclaredConstructor();
		System.out.println(construtorSubControle);

		construtorSubControle.setAccessible(true);

		SubControle instancia = construtorSubControle.newInstance();
		System.out.println(instancia);
	}
}
