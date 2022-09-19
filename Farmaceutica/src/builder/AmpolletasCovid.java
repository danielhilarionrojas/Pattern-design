package builder;
import productos.Ampolletas;

public class AmpolletasCovid implements IBuilderAmpolletas{
    private Ampolletas ampolletaC;
   
    public void reset( ){
        ampolletaC= new  Ampolletas();
    } 
      public void putEmbaseVidrio(){
          ampolletaC.setEmbaseVidrio(true);
      } 
        public String getDescripcion() {
        return "";
    }
    public void putLogo() {
   ampolletaC.setLogo(true);
    }
    public String getMarca() {
        return "";
    }
    public String getColor() {
        return "";
    }
    public Ampolletas getProducto() {
        return this.ampolletaC;
    }
    @Override
    public String toString() {
        return this.ampolletaC.getDescripcion()+" \n"+this.ampolletaC.getColor()+" \n"+this.ampolletaC.getMarca();
    }
  

      
       
    
}
