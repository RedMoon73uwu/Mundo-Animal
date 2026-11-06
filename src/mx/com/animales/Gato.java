package mx.com.animales;

public class Gato extends Animal{
    public Gato (String nombre, Integer edad){
        super (nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Miau (¿Esperando a que pase algo?)");
    }

}