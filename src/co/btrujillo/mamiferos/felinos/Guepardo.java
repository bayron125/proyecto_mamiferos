package co.btrujillo.mamiferos.felinos;

public class Guepardo extends Felinos{
    public Guepardo(String nombreCientifico, String habitat, float altura,
                    float largo, float peso,float garras,int velocidad){
      super(nombreCientifico,habitat,altura,largo,peso,garras,velocidad);
    }

    @Override
    public String comunicarse() {
        return "El "+ this.getClass().getSimpleName() + " se comunican a traves de mimos";
    }
}
