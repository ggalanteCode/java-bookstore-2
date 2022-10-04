package com.soprasteria.javabookstore;

public class Libro {

	public static void main(String[] args) {
		String titolo, editore, lingua, isbn;
		int numPagine;
		double peso, prezzo;
		
		prezzo = 34.20;
		
		double sconto = 20;
		
		double prezzoDaSottrarre = (prezzo/100)*sconto;
		
		double prezzoScontato = prezzo - prezzoDaSottrarre;
		
		System.out.println("Il prezzo iniziale del libro è: " + prezzo);
		System.out.println("Lo sconto è del " + sconto + "%");
		System.out.println("Il prezzo scontato del libro è: " + prezzoScontato);
	}

}
