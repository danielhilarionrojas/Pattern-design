package herencia2;
import java.util.Scanner;

public class Padre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    //FUNCIÓN PARA PEDIR LOS VALORES AL USUARIO
    public void pedirDatos(){
        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo valor");
        valor2 = entrada.nextInt();
    }
    
    //MÉTODO PARA MOSTRAR EL RESULTADO
    public void mostrarResultado(){
        System.out.println(resultado);
    }
}
