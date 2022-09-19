package Launcher;

import java.util.*;

public class Administrador {
	
	
	private static ArrayList <Room> listasalas;
	
	public void CrearSalas(String nombre) {
		Room s=new Room(nombre);
		listasalas.add(s);
		
	}
	
	public void AgregarEstSala(String nomSala, String nomEstudiante) {
		
		for (Room sala : listasalas) {
			
			if(nomSala==sala.getNomSala()) {
				sala.getListaEstudiantes().add(nomEstudiante);
				break;
			}
		} 
		
	}
	
	
	public void mostrarListaSalas() {
		for (Room sala : listasalas) {
			
			System.out.println("Nombre de sala: "+sala.getNomSala());
			
			if(sala.getListaEstudiantes().size()==0) {
				System.out.println("Esta sala esta vacia");
			}else{
			
			for (String estudiante: sala.getListaEstudiantes()) {
				System.out.println("Nombre de estudiante: "+estudiante + " Pertenciente a "+sala.getNomSala());
			}
			
			}
			
		
			
		} 
	}




	//PASO 1
	private Administrador() {
		
	}
	
	// PASO 2
	private static Administrador c;
	
	
	// PASO 3
	public static Administrador getAdmin() {
		if(c==null) {
			c=new Administrador();
			listasalas= new ArrayList<Room>();
		}
		return c;
	}
	
	
	
	

}
