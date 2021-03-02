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
	 
	 public void apresentaOpcaoInvalida() {
		 System.out.println();
		    System.out.println("--------------------------------"); 
			System.out.println("         Opcao Invalida         ");
			System.out.println("--------------------------------");
	 }
	 
	 public static void apresentaLerTemperaturas(int dia) {
		    System.out.println("-----------------------------------------------------"); 
			System.out.println("         Informe a temperatura do dia "+ dia + ":   ");
			System.out.println("         Use vírgula para separar parte inteira :   ");
			System.out.println("         Exemplo: 28,4                              ");
			System.out.println("-----------------------------------------------------");
			  System.out.print("////: ");
	 }
	 public  void apresentaSegundoMenu(){
			System.out.println("******************************** Menu *******************************");
			System.out.println("*                                                                   *");
			System.out.println("*        Digite 1 para calcular a temperatura média                 *");
			System.out.println("*        Digite 2 para calcular a temperatura mínima                *");
			System.out.println("*        Digite 3 para calcular a temperatura máxima                *");
			System.out.println("*        Digite 4 para emitir o relatório metereológico             *");
			System.out.println("*        Digite 5 para sair do programa                             *");
			System.out.println("*       (O relatório é um compilado de todos os cálculos a cima)    *");
			System.out.println("*                                                                   *");
			System.out.println("*********************************************************************");
			 System.out.print("////: ");
    
	 }
	 
	 
	 public  void apresentaVoceSaiu() {
		    System.out.println("--------------------------------"); 
			System.out.println("               FIM              ");
			System.out.println("--------------------------------");
	 }
	 
	 
	 public void apresentaTemperaturaMedia(int mes, double temperaturaMedia) {
		    System.out.println("-------------------------------------------"); 
			System.out.println(" A temperatura média do mês "+ mes+" foi: " + temperaturaMedia);
			System.out.println("-------------------------------------------");
	 }
	 
	 public void apresentaTemperaturaMinima(int mes, double temperaturaMinima) {
		    System.out.println("-------------------------------------------"); 
		    System.out.println(" A temperatura mínima do mês "+ mes+" foi: " + temperaturaMinima);
			System.out.println("-------------------------------------------");
	 }
	 
	 public void apresentaTemperaturaMaxima(int mes, double temperaturaMaxima) {
		    System.out.println("-------------------------------------------"); 
		    System.out.println(" A temperatura máxima do mês "+ mes+" foi: " + temperaturaMaxima);
			System.out.println("-------------------------------------------");
	 }
	 
	 public  void apresentaRelatorio(int mes,double temperaturaMedia, double temperaturaMinima,double temperaturaMaxima){
			System.out.println("**********************Relatório Metereológico ********************** ");
			System.out.println("                                                                     ");
			System.out.println("        Relatório do mes "+mes+"                                     ");
			System.out.println("        A temperatura média foi:" + temperaturaMedia +"              ");
			System.out.println("        A temperatura mínima foi:" + temperaturaMinima+"             ");
			System.out.println("        A temperatura máxima do foi:" + temperaturaMaxima+"          ");
			System.out.println("                                                                     ");
			System.out.println("*********************************************************************");
	 
	 
	 }
	 
	 
}
