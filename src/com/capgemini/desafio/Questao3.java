package com.capgemini.desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Questao3 {

	public static void main(String[] args) {
		
		System.out.println(Questao3.encriptaMensagem("tenha um bom dia"));
		
		
	}
	
	public static String encriptaMensagem(String texto) {
		String palavras = texto;
		String tudoJunto =  palavras.replaceAll("\\s+", "");
		String[] arrayPalavras = tudoJunto.split("(?!^)");
		
		
		int tamanho = tudoJunto.length();
		double raizTamanho = Math.sqrt(tamanho);
		int resultado = new BigDecimal(raizTamanho).setScale(0, RoundingMode.HALF_UP).intValue();
		
		String[][] reescrita = new String[resultado][resultado];
		String[][] mensagemCriptografada = new String[resultado][resultado];
		String mensagem = null;
		
		int contador = 0;
		
		for (int i = 0; i < resultado; i++) {
			for (int j = 0; j < resultado; j++) {
					if(contador >= arrayPalavras.length) {
						break;
					}
					reescrita[i][j] = arrayPalavras[contador];
					contador++;
			}
		}
		
		for (int i= 0; i<resultado; i++) {
			for (int j=0; j< resultado; j++) {
				if (reescrita[i][j] == null) {
					break;
				}
				mensagemCriptografada[j][i] = reescrita[i][j];				
			}
		}
		
		for (int i = 0; i < resultado; i++) {
			boolean parar = false;
			for (int j = 0; j < resultado; j++) {
				if (mensagemCriptografada[i][j] == null) {
					if ((resultado -1) == i) {
						parar = true;
					}
					break;
				}
				if (mensagem == null) {
					mensagem = mensagemCriptografada[i][j];
				}else {
					mensagem = mensagem + mensagemCriptografada[i][j];
				}
				
			}
			if (parar == true) {
				break;
			}
			mensagem = mensagem + " ";
			}		
		return mensagem;
	}	

}
