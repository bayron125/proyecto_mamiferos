package co.btrujillo.mamiferos;

import co.btrujillo.mamiferos.caninos.*;
import co.btrujillo.mamiferos.felinos.*;

import java.util.Arrays;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String args[]){
        List<Mamiferos> mamiferos=  Arrays.asList(new Perro("Lycaon pictus lupinus",
                "Africa Oriental",40,60,40,"Negro y marron",
                2,150),
                new Lobo("Canis lupus signatus", "Peninsula Iberica",
                        60,110,35,"cafe",3,
                        1, "lupus lineo"),
                new Guepardo("Acinonyx jubatus hecki", "Argelia",
                        80, 125,85,3,115),
                new Leon("Panthera leo bleyenberghi", "zona meridional de africa",
                        65,130,220,4,80,15,188),
                new Tigre("Panthera tigris tigris","P.tigris","India", 90,
                        300,250,4,90)
                );

        for(Mamiferos m: mamiferos){
            System.out.println("Animal           : " + m.getClass().getSimpleName());
            System.out.println("Nombre cientifico: " + m.getNombreCientifico());
            System.out.println("Habitat          : " + m.getHabitat());
            System.out.println("Altura           : " + m.getAltura() + " cm");
            System.out.println("Largo            : " + m.getLargo() + " cm");
            System.out.println("Peso             : "+ m.getPeso() + " cm");

            if ( m instanceof Caninos){
                System.out.println("Color            : " + ((Caninos) m).getColor());
                System.out.println("Tamaño Colmillos : "+ ((Caninos) m).getTamañoComillos() + " cm");

                if (m instanceof Lobo){
                    System.out.println("Fuerza mordida   : "+ ((Lobo) m).getTamañoComillos() + " cm");
                    System.out.println("Especie lobo     : " + ((Lobo) m).getEspecieLobo());
                }
                if(m instanceof Perro){
                    System.out.println("Fuerza mordida   : " + ((Perro) m).getFuerzaMordida() + " psi");
                }
            }
            if(m instanceof Felinos){
                System.out.println("Tamaño garras    : " + ((Felinos) m).getTamañoGarras() + " cm");
                System.out.println("Max. Velocidad   : " + ((Felinos) m).getVelocidad() + "Km/h");

                if( m instanceof Tigre){
                    System.out.println("Especie tigre    : " + ((Tigre) m).getEspecieTigre() );

                }
                if (m instanceof  Leon){
                    System.out.println("Numero de manada : " + ((Leon)m).getNumeroManada());
                    System.out.println("Potencia rugido  : " + ((Leon) m).getPotenciaRugidoDecibel() + " Decibeles");
                }

            }
            System.out.println();
        }
        System.out.println(mamiferos.get(2).correr());
        System.out.println(mamiferos.get(3).comer());
        System.out.println(mamiferos.get(1).comunicarse());
        System.out.println(mamiferos.get(0).dormir());

    }
}
