package launcher;
import java.util.ArrayList;

public class Cliente {
    public static void main(String[] args) {

        Director d = new Director();
        ArrayList productosArgentina = d.getProductoArgentina();
        ArrayList productosBolivia = d.getProductoBolivia();
        ArrayList productosColombia = d.getProductoColombia();
        System.out.println("PRODUCTO COLOMBIA:\n");
        for (Object object : productosColombia) {
            System.out.println(object);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("PRODUCTO BOLIVIA:\n");
        for (Object object : productosBolivia) {
                     System.out.println(object);
                     System.out.println("");
        }
        System.out.println("");
        System.out.println("PRODUCTO ARGENTINA: \n ");
        for (Object object : productosArgentina) {
             System.out.println(object);
             System.out.println("");
        }
    }
}