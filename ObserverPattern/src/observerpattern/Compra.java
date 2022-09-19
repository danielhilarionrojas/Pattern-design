
package observerpattern;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class Compra implements Observer {
    
    private AtomicInteger contador = new AtomicInteger();
    private ArrayList<Usuario> EscuchadorUsuarios;
    private int id;
    private String producto;
    private String estado;
    private int total;
    private int cantidad;

    public Compra(String product,  int total, int cantidad) {
        this.EscuchadorUsuarios = new ArrayList<>();
        this.id = contador.incrementAndGet();
        this.producto = product;
        this.total = total;
        this.cantidad = cantidad;
    }

    @Override
    public void InscribirUsuario(Usuario u) {
        this.EscuchadorUsuarios.add(u);
    }

    @Override
    public void NoInscritoUsuario(Usuario u) {
        this.EscuchadorUsuarios.remove(u);
    }

    @Override
    public void notificar(String producto, String estado) {
        for(Usuario u: EscuchadorUsuarios){
            u.actualizarEstadoCompra(producto, estado);
        }
    }
    
    public void setEstado(String estado){
        this.estado = estado;
        this.notificar(this.producto, this.estado);
    }
    
}
