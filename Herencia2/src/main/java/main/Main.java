package main;
import herencia2.HijaResta;
import herencia2.HijaSuma;

public class Main {
    
    public static void main(String[] args) {
        HijaSuma sumita = new HijaSuma();
        sumita.pedirDatos();
        sumita.sumar();
        System.out.print("El resultado de la suma es: ");
        sumita.mostrarResultado();
        
        HijaResta restica = new HijaResta();
        restica.pedirDatos();
        restica.mostrarResultado();
        System.out.print("El resultado de la resta es: ");
        restica.mostrarResultado();
    }
    
}
