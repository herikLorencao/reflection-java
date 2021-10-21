package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TesteInstanciaObjeto {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // url -> /controle/lista
        var url = "/controle/lista";
        var partesUrl = url.split("/");
        var clazzName = partesUrl[1].substring(0, 1).toUpperCase() +  partesUrl[1].substring(1).toLowerCase();
        Class<?> clazz = Class.forName("br.com.alura.alurator.playground.controle." + clazzName);
        Object objetoControleUrl = clazz.newInstance();

        Class<Controle> controleClasse1 = Controle.class;

        Controle controle = new Controle();
        Class<? extends Controle> controleClasse2 = controle.getClass();

        Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");

        Controle objetoControle = controleClasse1.newInstance();
        Object outroObjetoControle = controleClasse3.newInstance();

        System.out.println(objetoControle instanceof Controle);
        System.out.println(outroObjetoControle instanceof Controle);
        System.out.println(objetoControleUrl instanceof Controle);
    }
}
