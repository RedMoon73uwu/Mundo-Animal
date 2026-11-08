import mx.com.animales.Animal;
import mx.com.animales.Gato;
import mx.com.animales.Perro;
import mx.com.animales.Vaca;
import mx.com.animales.Movible;

public class Main {
    public static void main(String[] args){

Animal[] grupo ={
        new Perro("Frida", 9),
        new Gato("Mewo", 4),
        new Vaca ("Clara", 7)

};
        for (Animal animal : grupo){
            System.out.println("\n");
            animal.mostrarInformacion();
            animal.hacerSonido();
            animal.moverse();
            System.out.println("\n");
}
    }
}
