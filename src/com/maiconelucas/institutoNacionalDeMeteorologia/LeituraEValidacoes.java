package com.maiconelucas.institutoNacionalDeMeteorologia;
import java.util.Scanner;

public class LeituraEValidacoes  extends Painel {
	private int numeroMes;
	private int numeroAno;
	private int tamanhoMes;
	private double[] temperaturas;
	private double temperaturaMaxima;
	private double temperaturaMinima;
	private double temperaturaMedia;
	
	
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
	
	
	public int getTamanhoMes() {
		return tamanhoMes;
	}

	public void setTamanhoMes(int tamanhoMes) {
		this.tamanhoMes = tamanhoMes;
	}
    
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

    
	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
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
	
	
	public boolean verificaBissexto(int ano) {
		ano = getNumeroAno();
		
		if(ano == 2012 || ano == 2016 || ano == 2020) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public int obtemTamanhoMes() {
		int ano = getNumeroAno();
		int mes = getNumeroMes();
		boolean bissexto = verificaBissexto(ano);
		
		if (bissexto && mes == 2) {
			setTamanhoMes(29);
			return 29;
		}else if(!bissexto && mes == 2){
			setTamanhoMes(28);
			return 28;
		}else if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
			setTamanhoMes(31);
			return 31;
		}else{
			setTamanhoMes(30);
			return 30;
		}
	}
	
	
	public void lerTemperaturas(){ // TERMINAR !!!

		int tamanho = getTamanhoMes();
		double soma=0;
		double[] temperaturas = new double[tamanho];
		Scanner ler= new Scanner(System.in);
		for(int i=0;i<tamanho;i++){
		     apresentaLerTemperaturas(i);
		     temperaturas[i]=ler.nextDouble(); 
		     soma+=temperaturas[i];
		}
		setTemperaturas(temperaturas);
		
		ler.close();
		
		double maior=temperaturas[1];
		double menor=temperaturas[1];
		
		
		
		for(int i=0;i<tamanho;i++) {
			if(temperaturas[i]>maior) {
				maior=temperaturas[i];
			}
		}
		for(int i=0;i<tamanho;i++) {
			if(temperaturas[i]<menor) {
				menor=temperaturas[i];
			}
		
		}
		for(int i=0;i<tamanho;i++) {
			
		}
		double media=soma/tamanho;
		setTemperaturaMaxima(maior);
		setTemperaturaMinima(menor);
		setTemperaturaMedia(media);
	}
	
	
	
	

}

