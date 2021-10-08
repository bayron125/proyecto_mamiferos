package co.btrujillo.mamiferos.felinos;

public class Tigre extends Felinos{

    private String especieTigre;

    public Tigre(String nombreCientifico, String especie, String habitat, float altura, float largo, float peso,float garras,int velocidad){
        super(nombreCientifico,habitat,altura,largo,peso,garras,velocidad);
        this.especieTigre=especie;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }



    @Override
    public String dormir() {
        return "El "+ this.getClass().getSimpleName() + " duerme con tranquilidad ya que esta en la cima de la cadena alimenticia.";
    }

    @Override
    public String comunicarse() {
        return "Se comunica intimidando a sus adversarios con su robusto cuerpo.";
    }
}
