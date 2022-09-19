
package herencia;


public class Estudiante extends Persona{
    private int codigo;
    private float notaFinal;
    
   //CONSTRUCTOR DE CLASE HIJA
    public Estudiante(String nombre, String apellido, int edad, int codigo, float notaFinal){
        super(nombre, apellido, edad);
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                         "\nApellido: "+getApellido()+
                         "\nEdad: "+getEdad()+
                         "\nCodigo: "+codigo+
                         "\nNota final: "+notaFinal);
    }
}
