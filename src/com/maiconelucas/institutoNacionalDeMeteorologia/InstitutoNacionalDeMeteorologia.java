package com.maiconelucas.institutoNacionalDeMeteorologia;

import java.util.Scanner;

public class InstitutoNacionalDeMeteorologia {

public static void main(String[] args) {
		
		// testes	
	    Scanner ler=new Scanner(System.in);
		LeituraEValidacoes util = new LeituraEValidacoes();
		util.lerMesAno();
		util.getNumeroMes();
		util.getNumeroAno();
	    util.verificaBissexto(util.getNumeroAno());
	    util.obtemTamanhoMes();
	    util.getTamanhoMes();
	    util.lerTemperaturas();
	    
	    Painel painel=new Painel();
	    painel.apresentaSegundoMenu();
	   int i=0;
	   for(i=0;i<6;i++) {
		   
		   
		   if(i==1) {
			   painel.apresentaTemperaturaMedia(util.getNumeroMes(), util.getTemperaturaMedia());
		   }
		   else if(i==2) {
			   painel.apresentaTemperaturaMinima(util.getNumeroMes(), util.getTemperaturaMinima());
		   }
		   else if(i==3) {
			   painel.apresentaTemperaturaMaxima(util.getNumeroMes(), util.getTemperaturaMaxima());
		   }
		   else if(i==4) {
			   painel.apresentaRelatorio(util.getNumeroMes(), util.getTemperaturaMedia(), util.getTemperaturaMinima(), util.getTemperaturaMaxima());
		   }
		   else if(i==5) {
			   painel.apresentaVoceSaiu();
		   }
		   else {
			   painel.apresentaOpcaoInvalida();
		   }
	   }
	    
	}

}


