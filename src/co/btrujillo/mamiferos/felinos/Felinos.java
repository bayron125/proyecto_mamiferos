package co.btrujillo.mamiferos.felinos;

import co.btrujillo.mamiferos.Mamiferos;

abstract public class Felinos extends Mamiferos {
    protected float tamañoGarras;
    protected int velocidad;

    public Felinos(){
    }
    public Felinos(String nombreCientifico, String habitat, float altura, float largo, float peso,float garras,int velocidad){
        super(nombreCientifico,habitat,altura,largo,peso);
        this.tamañoGarras=garras;
        this.velocidad= velocidad;
    }

    public float getTamañoGarras() {
        return tamañoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String comer() {
        return  "El " + this.getClass().getSimpleName() + " atrapa su presa con sus garras de " + this.tamañoGarras + " cm";
    }

    @Override
    public String correr() {
        return "El " + this.getClass().getSimpleName() + " corre a una velocidad de " +
                this.getVelocidad() + "Km/h";
    }

    @Override
    public String dormir() {
        return "El " + this.getClass().getSimpleName() + " duerme apoyando su cuerpo de " +
                this.getPeso() + " en las superficies de "+ this.getHabitat() ;
    }
}
