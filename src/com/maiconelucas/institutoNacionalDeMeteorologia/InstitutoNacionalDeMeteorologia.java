package com.maiconelucas.institutoNacionalDeMeteorologia;

public class InstitutoNacionalDeMeteorologia {

	public static void main(String[] args) {
		
		// testes
		LeituraEValidacoes util = new LeituraEValidacoes();
		
		util.lerMesAno();
		System.out.println(util.getNumeroMes());
		System.out.println(util.getNumeroAno());

	}

}
