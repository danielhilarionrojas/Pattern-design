package figuras;
import figuras.Circle;
import figuras.Square;
import figuras.iShape;
import figuras.ShapeFactory;

public class Client {
    public static void main(String[] args) {
        
        ShapeFactory factory = new ShapeFactory(); 
        Circle c = new Circle();
        c.setR(10);
        System.out.println(c.darArea());
    }
    
}
