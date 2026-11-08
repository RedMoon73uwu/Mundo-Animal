package mx.com.animales;

public abstract class Animal {
    private String nombre;
    private Integer edad;

    public Animal (String nombre,Integer edad){
            this.nombre=nombre;
            this.edad=edad;
        }

    public void mostrarInformacion(){
        System.out.println("El nombre del animal es: "+this.nombre+" y tiene: "+this.edad +" años de edad.");
    }

    public void hacerSonido(){

    }

    public void moverse(){}
}
