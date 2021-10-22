package animales;

public abstract class Animal {
    protected int edad;
    protected String nombre;
    public Animal(){
    }

    public Animal(String nombre){
        this.nombre = nombre;
        System.out.println("Constructor padre");
    }

    public Animal(String nombre, int edad){
        this.nombre =nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comunicarse(){
        System.out.println("Hola");
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }

    // Implementación de metodo abstracto
    public abstract void respirar();
}
