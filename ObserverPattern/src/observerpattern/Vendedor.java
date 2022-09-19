
package observerpattern;


public class Vendedor implements Usuario {
    
    private String name;

    public Vendedor(String name) {
        this.name = name;
    }

    @Override
    public void actualizarEstadoCompra(String producto, String estado) {
        System.out.println(name + ": Venta de: " + producto + ", cambio a: " + estado);
    }
    
    
    
}
