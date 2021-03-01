package com.maiconelucas.institutoNacionalDeMeteorologia;

public class InstitutoNacionalDeMeteorologia {

public static void main(String[] args) {
		
		// testes	
		LeituraEValidacoes util = new LeituraEValidacoes();
		
		util.lerMesAno();
		System.out.println(util.getNumeroMes());
		System.out.println(util.getNumeroAno());
		
		System.out.println(util.verificaBissexto(util.getNumeroAno()));
		System.out.println("o tamanho do mes eh: " + util.obtemTamanhoMes());
		System.out.println(util.getTamanhoMes());
		
		util.lerTemperaturas();
		System.out.println("A temperatura máxima foi:"+util.getTemperaturaMaxima());
		System.out.println("A temperatura mínima foi:"+util.getTemperaturaMinima());
		System.out.println("A temperatura média foi:"+util.getTemperaturaMedia());
	
	}

}


