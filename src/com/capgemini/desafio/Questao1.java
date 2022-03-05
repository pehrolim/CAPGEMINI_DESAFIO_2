package com.capgemini.desafio;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(9);
		numeros.add(2);
		numeros.add(1);
		numeros.add(4);
		numeros.add(6);
		
		Questao1.encontraMediana(numeros);	
	
	}
	
	public static int encontraMediana(List<Integer> vetor) {
		int resultado = 0;
		List<Integer> numeros = vetor;
		
		numeros.sort(null);
		
		if (numeros.size() % 2 != 0) {
			int posicaoNumero = ((numeros.size() + 1) / 2) - 1;
			resultado = numeros.get(posicaoNumero);
		}
		return resultado;
		
	}

}
