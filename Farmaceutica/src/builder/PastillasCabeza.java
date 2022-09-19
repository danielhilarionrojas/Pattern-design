package builder;

import productos.Pastillas;

/**
 *
 * @author alejonba0498
 */
public class PastillasCabeza implements IBuilderPastillas {

    private Pastillas pastillaC;

    public void reset() {
        pastillaC = new Pastillas();
    }

    public void putBlister() {
        pastillaC.setBlister(true);
    }

    public String getDescripcion() {

        return "";
    }

    public void putLogo() {
        pastillaC.setLogo(true);
    }

    public String getMarca() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public Pastillas getProducto() {
        return this.pastillaC;
    }

    @Override
    public String toString() {
        return this.pastillaC.getDescripcion() + "\n " + this.pastillaC.getColor() + " \n" + this.pastillaC.getMarca();
    }

}


