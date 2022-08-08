package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String[] invitati={"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		String nome;
		boolean flag=false;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Come ti chiami?");
		nome=scan.nextLine();
		
		
		for(int i=0;i<invitati.length;i++) {
			
			if(nome.equalsIgnoreCase(invitati[i])) {
				
				flag=true;
			}
			
		}
		
		if(flag) {
			System.out.println("Puoi entrare!");
		}else {
			System.out.println("Non sei invitato!");
		}
		
		scan.close();

	}

}
