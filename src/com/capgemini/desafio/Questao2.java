package com.capgemini.desafio;

public class Questao2 {

	public static void main(String[] args) {
		
		int[] vetor = {1,5,3,4,2};
		int n = 2;
		
		Questao2.encontraPares(vetor, n);
	}
	
	public static int encontraPares(int[] vetor, int numero) {
		int n = numero;
		int[] numeros = vetor;
		int pares = 0;
		
		for (int i = 0;i < vetor.length; i++) {
			int resultado = numeros[i] - n;
			for (int j=0; j < vetor.length; j++) {
				if (numeros[j] == resultado)
					pares++;
			}
		}
		return pares;
	}
}
