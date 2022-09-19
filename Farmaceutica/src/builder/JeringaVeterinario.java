package builder;

import productos.Jeringas;


public class JeringaVeterinario implements IBuilderJeringas {

    private Jeringas jeringaV;

    public void reset() {
        jeringaV = new Jeringas();
    }

    public void putAguja() {
        jeringaV.setLogo(true);
    }

    public String getDescripcion() {

        return "";
    }

    public void putLogo() {
        jeringaV.setLogo(true);
    }

    public String getMarca() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public Jeringas getProducto() {
        return this.jeringaV;
    }

    @Override
    public String toString() {
        return this.jeringaV.getDescripcion() + "\n " + this.jeringaV.getColor() + " \n" + this.jeringaV.getMarca();
    }

}