package builder;
import productos.Ampolletas;

public class AmpolletasInfluenza implements IBuilderAmpolletas {

     private Ampolletas ampolletaI;
    
    public void reset( ){
        ampolletaI= new  Ampolletas();
    }   
    public void putEmbaseVidrio() {
            ampolletaI.setEmbaseVidrio(true);
    }

    public String getDescripcion() {

        return "";
    }

    public void putLogo() {
      ampolletaI.setLogo(true);
    }

    public String getMarca() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public Ampolletas getProducto() {
        return this.ampolletaI;
    }
    
      @Override
    public String toString() {
        return this.ampolletaI.getDescripcion()+" \n"+this.ampolletaI.getColor()+" \n"+this.ampolletaI.getMarca();
    }
  

}