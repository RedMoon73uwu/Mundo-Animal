package mx.com.animales;

public class Vaca extends Animal{
    public Vaca (String nombre, Integer edad){
        super (nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Muuuuuuu");
    }

}