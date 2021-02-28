package com.maiconelucas.institutoNacionalDeMeteorologia;

public class Painel {

	/**
	 * Primeiro menu
	 * @author mikee
	 */
	 public static void apresentaPrimeiroMenu(){
		System.out.println("******************************** Menu *******************************");
		System.out.println("*                                                                   *");
		System.out.println("*        Digite nessa sequencia o Mês e o Ano a ser cadastrado:     *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");
		  System.out.print("////: ");
	}
	 
	 public static void apresentaOpcaoInvalida() {
		    System.out.println("--------------------------------"); 
			System.out.println("         Opcao Invalida         ");
			System.out.println("--------------------------------");
	 }
	 
	 public static void apresentaLerTemperaturas(int dia) {
		    System.out.println("------------------------------------------------"); 
			System.out.println("         Informe a temperatura do dia "+ dia + ":   ");
			System.out.println("------------------------------------------------");
	 }
}

