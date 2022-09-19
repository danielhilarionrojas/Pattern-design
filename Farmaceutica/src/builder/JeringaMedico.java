package builder;
import productos.Jeringas;

public class JeringaMedico implements IBuilderJeringas{
    
     private Jeringas jeringaM;

    public void reset() {
        jeringaM = new Jeringas();
    }

  
    public void putAguja() {
        jeringaM.setAguja(true);
    }

    public String getDescripcion() {

        return "Jeringa para médico";
    }

    public void putLogo() {
        jeringaM.setLogo(true);
        
    }

    public String getMarca() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public Jeringas getProducto() {
        return this.jeringaM;
    }
     
       
      @Override
    public String toString() {
        return this.jeringaM.getDescripcion()+"\n "+this.jeringaM.getColor()+"\n "+this.jeringaM.getMarca();
    }
  
    
}