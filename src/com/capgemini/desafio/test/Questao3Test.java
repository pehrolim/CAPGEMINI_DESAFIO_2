package com.capgemini.desafio.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.desafio.Questao3;

class Questao3Test {

	@Test
	void deveriaRetornarOMDLUOAN() {
		
		Assert.assertEquals("omd luo an", Questao3.encriptaMensagem("ola mundo") );
		
	}
	
	@Test
	void deveriaRetornarTAOAEUMNMDHBI() {
		
		Assert.assertEquals("taoa eum nmd hbi", Questao3.encriptaMensagem("tenha um bom dia") );
		
	}

}
