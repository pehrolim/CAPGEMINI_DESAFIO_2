package com.capgemini.desafio.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.desafio.Questao1;

class Questao1Test {

	@Test
	void deveriaRetornar4() {
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(9);
		numeros.add(2);
		numeros.add(1);
		numeros.add(4);
		numeros.add(6);
		
		Assert.assertEquals(4, Questao1.encontraMediana(numeros));
	}
	
	@Test
	void deveriaRetornar5() {
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(9);
		numeros.add(2);
		numeros.add(1);
		numeros.add(4);
		numeros.add(6);
		numeros.add(5);
		numeros.add(12);
		
		Assert.assertEquals(5, Questao1.encontraMediana(numeros));
	}

}
