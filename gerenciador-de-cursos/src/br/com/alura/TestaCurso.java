package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java\",\r\n", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
//		List<Aula> aulasModificadas = new ArrayList<>(javaColecoes.getAulas());
//		Collections.sort(aulasModificadas);
		
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		 javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(javaColecoes.getAulas());  
		
	}
	
	
	
	
	
	
	

}
