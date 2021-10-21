package br.com.alura.alurator.reflexao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ManipuladorMetodo {
	private Object instancia;
	private Method metodo;

	public ManipuladorMetodo(Object instancia) {
		this.instancia = instancia;
	}

	public ManipuladorMetodo getMetodoPublico(String nomeMetodo) {
		var clazz = this.instancia.getClass();

		try {
			this.metodo = clazz.getMethod(nomeMetodo);
			return this;
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public ManipuladorMetodo getMetodoPrivado(String nomeMetodo) {
		var clazz = this.instancia.getClass();

		try {
			this.metodo = clazz.getDeclaredMethod(nomeMetodo);
			this.metodo.setAccessible(true);
			return this;
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public Object invocarMetodo(Object[] params) {
		try {
			return this.metodo.invoke(instancia, params);
		} catch (IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	public Object invocar(Object[] ...args) {
		try {
			if (args.length > 0) {				
				return this.metodo.invoke(instancia, args);
			} 
			
			return this.metodo.invoke(instancia);
		} catch (IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (InvocationTargetException e) {
			throw new RuntimeException("Problema ao invocar o método", e.getTargetException());
		}
	}
}
