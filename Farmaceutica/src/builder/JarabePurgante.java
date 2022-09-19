package builder;

import productos.Jarabes;


public class JarabePurgante implements IBuilderJarabe {

    private Jarabes jarabeP;

    public void reset() {
        jarabeP = new Jarabes();
    }

    public void embasePlastico() {
       jarabeP.setEmbasePlastico(true);
    }

    public String getDescripcion() {

        return "";
    }

    public void putLogo() {
        jarabeP.setLogo(true);
    }

    public String getMarca() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public Jarabes getProducto() {
        return this.jarabeP;
    }
      @Override
    public String toString() {
        return this.jarabeP.getDescripcion()+"\n "+this.jarabeP.getColor()+"\n "+this.jarabeP.getMarca();
    }
  

}
