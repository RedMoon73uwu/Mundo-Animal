package mx.com.animales;

public abstract class Animal {
    private String nombre;
    private Integer edad;

    public Animal (String nombre,Integer edad){
            this.nombre=nombre;
            this.edad=edad;
        }

    public void mostrarInformacion(){
        System.out.println("el nombre del animal es: "+this.nombre+" y tiene: "+this.edad +" de edad.");
    }

    public void hacerSonido(){

    }
}
