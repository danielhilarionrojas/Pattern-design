
package observerpattern;
import observerpattern.Compra;
import observerpattern.Observer;
import observerpattern.Vendedor;
import observerpattern.Compra;


public class Launcher {
    public static void main(String[] args) {
        
        //VENDEDORES
        Usuario tendero1 = new Vendedor("Daniel");
        Usuario tendero2 = new Vendedor("Diego");
        Usuario cliente1 = new Cliente("Oscar");
        Usuario cliente2 = new Cliente("Alejandro");
        
        //COMPRAS
        Compra compra1 = new Compra("Tussi", 10, 1);
        compra1.InscribirUsuario(tendero1);
        compra1.InscribirUsuario(cliente1);
        compra1.setEstado("Done");
        
        Compra compra2 = new Compra("Cuello", 1, 5);
        compra2.InscribirUsuario(tendero2);
        compra2.InscribirUsuario(cliente2);
        System.out.println();
        compra2.setEstado("Done");
        
        //IMPRESIÓN
        System.out.println();
        compra2.setEstado("Successful");
        compra1.setEstado("Successful");
        
        System.out.println();
        compra1.setEstado("Ready");
        compra1.setEstado("Finish");
        
        System.out.println();
        compra2.setEstado("Ready");
        compra1.setEstado("Finish");
    }
}
