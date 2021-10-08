package co.btrujillo.mamiferos.caninos;

public class Lobo extends Caninos{

    private int numeroDeCamada;
    private String especieLobo;

    public Lobo(String nombreCientifico, String habitat, float altura, float largo,
                float peso, String color, float tamañoComillos, int numeroDeCamada,
                String especieLobo) {
        super(nombreCientifico, habitat, altura, largo, peso, color, tamañoComillos);
        this.numeroDeCamada = numeroDeCamada;
        this.especieLobo = especieLobo;
        this.tamañoComillos=tamañoComillos;
    }

    public int getNumeroDeCamada() {
        return numeroDeCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "los " + this.getClass().getSimpleName() + "s buscan sus alimentos en grupo acorralando a sus presas desgarrando a sus presas con sus colmillos de "+ this.getTamañoComillos();
    }



    @Override
    public String dormir() {
        return  "el sueño o descanso del " + this.getClass().getSimpleName() +" es muy prolongado, llegando a ocupar un 30% de su tiempo.";
    }

    @Override
    public String comunicarse() {
        return "los "+ this.getClass().getSimpleName()+ "s se comunican con su manada a traves  de auyidos que se pueden escuchar a kilometros de distancia";
    }
}
