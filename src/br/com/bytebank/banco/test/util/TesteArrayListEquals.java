package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
	     
//		Conta cc1 = new ContaCorrente(33, 33);
//		Conta cc2 = new ContaCorrente(33, 33);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(33, 22);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(44, 33);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(44, 33);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
		
	    for(Conta conta : lista) {
	    	System.out.println(conta);
	    }
	
	}

}
