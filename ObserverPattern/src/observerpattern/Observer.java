
package observerpattern;


public interface Observer {
    
    public void InscribirUsuario(Usuario u);
    public void NoInscritoUsuario(Usuario u);
    public void notificar(String producto, String estado);
    
}
