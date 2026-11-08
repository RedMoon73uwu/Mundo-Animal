package mx.com.animales;

public class Caballo extends Animal implements Movible{
    public Caballo (String nombre, Integer edad) {
        super (nombre, edad );
    }

    @Override
    public void hacerSonido(){
        System.out.println("HEEE HEEE HE, brrrr");
    }

    @Override
    public void moverse(){
        System.out.println("caminar, saltar y galopar");
    }
}
