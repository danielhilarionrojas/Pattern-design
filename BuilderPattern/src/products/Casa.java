/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

public class Casa {

	private boolean puertas = false;
	private boolean ventanas = false;
	private boolean paredes = false;
	private boolean techo = false;

	private boolean jardin = false;
	private boolean parqueadero = false;

	@Override
	public String toString() {

		if (this.parqueadero) {
			return "Casa con Parqueadero";

		} else if (this.jardin) {
			return "Casa con Jardin";

		} else {

			return "Casa Sencilla";
		}
	}

	public boolean isPuertas() {
		return puertas;
	}

	public void setPuertas(boolean puertas) {
		this.puertas = puertas;
	}

	public boolean isVentanas() {
		return ventanas;
	}

	public void setVentanas(boolean ventanas) {
		this.ventanas = ventanas;
	}

	public boolean isParedes() {
		return paredes;
	}

	public void setParedes(boolean paredes) {
		this.paredes = paredes;
	}

	public boolean isTecho() {
		return techo;
	}

	public void setTecho(boolean techo) {
		this.techo = techo;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	public boolean isParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(boolean parqueadero) {
		this.parqueadero = parqueadero;
	}

}
