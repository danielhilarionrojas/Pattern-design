package Launcher;


import java.util.*;

public class Room {
	
	private ArrayList <String> listaEstudiantes= new ArrayList<>();
	

	private String nomSala="";
	
	public Room(String nomSala) {
		this.nomSala = nomSala;
		
	}
	
	
	public ArrayList<String> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ArrayList<String> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	
	public String getNomSala() {
		return nomSala;
	}


	public void setNomSala(String nomSala) {
		this.nomSala = nomSala;
	}

	
	
	

}
