package builder;

import productos.Jarabes;

/**
 *
 * @author alejonba0498
 */
public class JarabeTos implements IBuilderJarabe {

    private Jarabes jarabeT;

    public void reset() {
        jarabeT = new Jarabes();
    }

    public void embasePlastico() {
        jarabeT.setEmbasePlastico(true);
    }

    public String getDescripcion() {

        return "";
    }

    public void putLogo() {
        jarabeT.setLogo(true);
    }

    public String getMarca() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public Jarabes getProducto() {
        return this.jarabeT;
    }

    @Override
    public String toString() {
        return this.jarabeT.getDescripcion() + " \n" + this.jarabeT.getColor() + " \n" + this.jarabeT.getMarca();
    }

}
