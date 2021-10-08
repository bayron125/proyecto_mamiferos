package co.btrujillo.mamiferos.caninos;

import co.btrujillo.mamiferos.Mamiferos;

abstract public class Caninos extends Mamiferos {
    protected String color;
    protected float tamañoComillos;

    public Caninos(String nombreCientifico, String habitat,
                   float altura, float largo, float peso,
                   String color, float tamañoComillos) {
        super(nombreCientifico, habitat, altura, largo, peso);
        this.color = color;
        this.tamañoComillos = tamañoComillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamañoComillos() {
        return tamañoComillos;
    }

    @Override
    public String correr() {
        return "El " + this.getClass().getSimpleName() + " al igual que todos los caninos corren en manadas que es permite protegerse de posibles amenazas" ;
    }
}
