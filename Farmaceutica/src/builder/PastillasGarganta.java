package builder;

import productos.Pastillas;

/**
 *
 * @author alejonba0498
 */
public class PastillasGarganta implements IBuilderPastillas {

    private Pastillas pastillaG;

    public void reset() {
        pastillaG = new Pastillas();
    }

    public void putBlister() {
        pastillaG.setBlister(true);
    }

    public String getDescripcion() {

        return "";
    }

    public void putLogo() {
        pastillaG.setLogo(true);
    }

    public String getMarca() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public Pastillas getProducto() {
        return this.pastillaG;
    }

    @Override
    public String toString() {
        return this.pastillaG.getDescripcion() + "\n " + this.pastillaG.getColor() + " \n" + this.pastillaG.getMarca();
    }

}
