package mx.com.animales;

public class Perro extends Animal implements Movible{
    public Perro (String nombre, Integer edad){
        super (nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Woof Woof...\n AUUUUH!");
    }

    @Override
    public void moverse (){
        System.out.println("camina, corre, salta y excava");
    }
}
