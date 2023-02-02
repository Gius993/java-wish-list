package org.lessons.java.christmas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <String> regali = new ArrayList<>();
		boolean whiFunction = true;
		
		while(true) {
			System.out.println("Vuoi comprare un regalo ?");
			String compra = scan.nextLine();
			if(compra.equals("si")) {
				System.out.println("cosa vuoi comprare?");
				String regaloComprato = scan.nextLine();
				regali.add(regaloComprato);
				System.out.println("hai aggiunto " + regali.size() + " Regali");
				
				continue;
			}else if (compra.equals("no")) {
				whiFunction = false;
				System.out.println("non devi comprare");
			}
			break;
			
		}
		Collections.sort(regali);
		System.out.println(regali);
		
	}
}
