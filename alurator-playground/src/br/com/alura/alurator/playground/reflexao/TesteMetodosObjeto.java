package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteMetodosObjeto {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException {

		var clazzSubControle = SubControle.class;

		for (Method m : clazzSubControle.getMethods()) {
			System.out.println(m);
		}

		System.out.println();

		for (Method m : clazzSubControle.getDeclaredMethods()) {
			System.out.println(m);
		}
		
		var construtorPadrao = clazzSubControle.getDeclaredConstructor();
		construtorPadrao.setAccessible(true);
		var subControle = construtorPadrao.newInstance();

		// getMethod() - retorna todos os metodos (herdados etc) desde que sejam publicos
		Method m = clazzSubControle.getMethod("metodoControle1");
		m.invoke(subControle);
		
		// getDeclaredMethod() - retorna métodos privados mas só da classe
		Method m2 = clazzSubControle.getDeclaredMethod("metodoSubControle2");
		m2.setAccessible(true);
		var retorno = m2.invoke(subControle);
		System.out.println(retorno);
	}
}
