package com.capgemini.desafio.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.desafio.Questao2;

class Questao2Test {

	@Test
	void deveriaRetornar3() {
		
		int[] vetor = {1,5,3,4,2};
		int n = 2;
		
		Assert.assertEquals(3, Questao2.encontraPares(vetor, n));
	}
	
	@Test
	void deveriaRetornar2() {
		
		int[] vetor = {1,5,3,4,2};
		int n = 3;
		
		Assert.assertEquals(2, Questao2.encontraPares(vetor, n));
	}

}
