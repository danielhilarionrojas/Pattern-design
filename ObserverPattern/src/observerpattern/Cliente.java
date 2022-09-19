
package observerpattern;


public class Cliente implements Usuario {
    
    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    @Override
    public void actualizarEstadoCompra(String producto, String estado) {
        System.out.println(name + ": Compra de " + producto + ", a cambiado a: " + estado);
    }
    
    
    
}
