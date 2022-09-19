/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import builderPattern.*;
import builderpattern.BuilderCasa;
import products.*;
public class Director {

	
	public Casa getCasaParqueadero() {
		BuilderCasa casap= new BuilderCasa();
		casap.reset();
		casap.putParedes();
		casap.putParqueadero();
		casap.putPuertas();
		casap.putTecho();
		casap.putVentanas();
		
		return casap.getProduct();
	}
	
	
	public Casa getCasaJardin() {
		BuilderCasa casaj= new BuilderCasa();
		casaj.reset();
		casaj.putParedes();
		casaj.putJardin();
		casaj.putPuertas();
		casaj.putTecho();
		casaj.putVentanas();
		
		return casaj.getProduct();
	}
	
	
	public Casa getCasaSencilla() {
		BuilderCasa casase= new BuilderCasa();
		casase.reset();
		casase.putParedes();
		casase.putPuertas();
		casase.putTecho();
		casase.putVentanas();
		return casase.getProduct();
	}
}

