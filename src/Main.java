import mx.com.animales.*;

public class Main {
    public static void main(String[] args){

Animal[] grupo ={
        new Perro("Frida", 9),
        new Gato("Mewo", 4),
        new Vaca ("Clara", 7),
        new Caballo("William", 12)

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
