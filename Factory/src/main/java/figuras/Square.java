
package figuras;


public class Square implements iShape {
    
    private int r = 5;
    
    public double darArea(){
        return r*r;
    }
    
    public void setR(int r){
        this.r=r;
    }
    
}
