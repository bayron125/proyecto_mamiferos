package co.btrujillo.mamiferos.caninos;

public class Perro extends Caninos{

    private int fuerzaMordida;

    public Perro(String nombreCientifico, String habitat, float altura,
                 float largo, float peso, String color, float tamañoComillos,
                 int fuerzaMordida) {
        super(nombreCientifico, habitat, altura, largo, peso, color, tamañoComillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los" + this.getClass().getSimpleName() + "s al momento de cazar a sus presas pueden llegar a ejercer una presion con su mordida de hasta " + this.fuerzaMordida + " generando mucho daño en ellas.";
    }

    @Override
    public String dormir() {
        return "El " + this.getClass().getSimpleName() + " puede llegar  a dormir hasta 12 horas al dia." ;
    }

    @Override
    public String comunicarse() {
        return "los " + this.getClass().getSimpleName() + "s tienen muy buena interaccion entre ellos lo que les permite integrar varias comunidades";
    }
}
