package br.com.alura;

import java.util.List;

public class TesteCurso2 {

	public static void main(String[] args) {
		

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

	}

}
