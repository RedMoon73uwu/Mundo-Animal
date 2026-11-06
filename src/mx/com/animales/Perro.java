package mx.com.animales;

public class Perro extends Animal{
    public Perro (String nombre, Integer edad){
        super (nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Woof Woof...\n AUUUUH!");
    }

}
