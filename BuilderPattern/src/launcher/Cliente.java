/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import products.Casa;

public class Cliente {

	public static void main(String[] args) {
		
		Director d= new Director();
		Casa daniel=d.getCasaParqueadero();
		Casa diego=d.getCasaJardin();
		Casa oscar=d.getCasaSencilla();
		
		
		System.out.println("La casa de Daniel es: ");
		System.out.println(daniel.toString()+"\n");
		
		System.out.println("La casa de Diego es: ");
		System.out.println(diego.toString()+"\n");
		
		System.out.println("La casa de Oscar es: ");
		System.out.println(oscar.toString());
		
	}

}

