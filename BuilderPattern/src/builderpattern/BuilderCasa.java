
package builderpattern;

import products.Casa;
import products.*;

public class BuilderCasa implements ICasa {

	private Casa casap;

	public void reset() {
		casap = new Casa();
	}

	@Override
	public void putPuertas() {
		casap.setPuertas(true);

	}

	@Override
	public void putVentanas() {
		casap.setVentanas(true);

	}

	@Override
	public void putParedes() {
		casap.setParedes(true);

	}

	@Override
	public void putTecho() {
		casap.setTecho(true);

	}

	@Override
	public void putParqueadero() {
		casap.setParqueadero(true);

	}

	@Override
	public void putJardin() {
		casap.setJardin(true);

	}

	public Casa getProduct() {
		return this.casap;
	}

}
