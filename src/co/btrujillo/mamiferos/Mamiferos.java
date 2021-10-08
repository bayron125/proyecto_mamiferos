package co.btrujillo.mamiferos;

abstract public class Mamiferos {
    protected String nombreCientifico, habitat;
    protected float altura, largo, peso;

    public Mamiferos(){
    }
    public Mamiferos(String nombreCientifico, String habitat){
        this();
        this.nombreCientifico=nombreCientifico;
        this.habitat= habitat;
    }

    public Mamiferos(String nombreCientifico, String habitat, float altura, float largo, float peso){
        this(nombreCientifico,habitat);
        this.altura=altura;
        this.largo=largo;
        this.peso=peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    abstract public String comer();
    abstract public String correr();
    abstract public String dormir();
    abstract public String comunicarse();
}
