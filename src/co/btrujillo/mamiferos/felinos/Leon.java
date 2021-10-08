package co.btrujillo.mamiferos.felinos;

public class Leon extends Felinos

{
    private int numeroManada;
    private float potenciaRugidoDecibel;

    public Leon(String nombreCientifico, String habitat, float altura,
                float largo, float peso, float garras, int velocidad,
                int numeroManada, float potenciaRugidoDecibel) {
        super(nombreCientifico, habitat, altura, largo, peso, garras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }




    @Override
    public String dormir() {
         return "El " + this.nombreCientifico+ " conocido popularmente como " + this.getClass().getSimpleName() + "duerme durante casi todo el dia.";
    }

    @Override
    public String comunicarse() {
        return "El " + this.getClass().getSimpleName() + "impone su autoridada a travez de u rugido que alcanza los " + this.potenciaRugidoDecibel + " decibeles";
    }
}
