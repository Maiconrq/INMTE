package com.maiconelucas.institutoNacionalDeMeteorologia;

import java.util.Scanner;

public class LeituraEValidacoes extends Painel {
	private int numeroMes;
	private int numeroAno;
	private double[] temperaturas;
	
	public LeituraEValidacoes() {
	}

	public LeituraEValidacoes(int numeroMes, int numeroAno, double[] temperaturas) {
		this.numeroMes = numeroMes;
		this.numeroAno = numeroAno;
		this.temperaturas = temperaturas;
	}
	

	public int getNumeroMes() {
		return numeroMes;
	}

	public void setNumeroMes(int numeroMes) {
		this.numeroMes = numeroMes;
	}

	public int getNumeroAno() {
		return numeroAno;
	}

	public void setNumeroAno(int numeroAno) {
		this.numeroAno = numeroAno;
	}

	public double[] getTemperaturas() {
		return temperaturas;
	}

	public void setTemperaturas(double[] temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	

	public boolean validaMesAno(int mes, int ano ){
		if( (ano < 2011 || ano > 2020) || (mes < 1 || mes > 12) ) {
			return false;
		}else {
			return true;
		}
	}
	
	Scanner ler = new Scanner(System.in);
	public void lerMesAno(){
		
		boolean opcaoInvalida;
		do {
			
			apresentaPrimeiroMenu();
			
			int mes = ler.nextInt();
			int ano = ler.nextInt();
			
			
			boolean valida = validaMesAno(mes, ano);
			if(valida) {
				setNumeroAno(ano);
				setNumeroMes(mes);
				opcaoInvalida = false;
			}else {
				apresentaOpcaoInvalida();
				opcaoInvalida = true;
			}
		}while(opcaoInvalida);
	}
	
	
	
	/*public int obtemTamanhoMes() {
		
	}*/
	
	
	
}
