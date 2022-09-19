package Launcher;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Administrador c=Administrador.getAdmin();
		
		System.out.println();
		System.out.println(c.toString());
		
		
		c.CrearSalas("Sala 1");
		
		System.out.println();
		System.out.println(c.toString());
		c.mostrarListaSalas();
		
		System.out.println();
		Administrador d=Administrador.getAdmin();
		d.CrearSalas("Sala 2");
		System.out.println(d.toString());
		d.mostrarListaSalas();
		
		System.out.println();
		d.AgregarEstSala("Sala 2","Daniel");
		System.out.println(d.toString());
		d.mostrarListaSalas();
		
		
		System.out.println();
		d.AgregarEstSala("Sala 1","Oscar");
		c.AgregarEstSala("Sala 2","Alejandro");
		System.out.println(d.toString());
		d.mostrarListaSalas();
		
		
		
	}

}

