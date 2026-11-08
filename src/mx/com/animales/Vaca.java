package mx.com.animales;

public class Vaca extends Animal implements Movible{
    public Vaca (String nombre, Integer edad){
        super (nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Muuuuuuu");
    }

   @Override
    public void moverse (){
        System.out.println("camina, corre, salta y pasta");
    }

}