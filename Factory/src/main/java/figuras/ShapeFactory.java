package figuras;


public class ShapeFactory {
    
    public static iShape getShape(int i){
        if(i==0){
            return new Circle();
        }else{
            return new Square();
        }    
    }
}
