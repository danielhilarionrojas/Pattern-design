package figuras;


public class Circle implements iShape {
    
    private int r = 5;
    
    public double darArea(){
        return Math.PI*r*r;
    }
     
    public void setR(int r){
        this.r=r;
    }
    
    
}
