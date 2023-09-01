package metods;

import animals.Animal;
import species.Eagle;
import species.Leon;
import species.Tiger;

import java.util.List;

public class Metods {

    public static void TailMoreLong(List<Animal> zoo) {
        Animal animaleTailMoreLong = null;
        double maxCoda = 0;
        String species="";

        for (Animal animale : zoo) {
            if (animale instanceof Leon || animale instanceof Tiger) {
                double tailLength = 0;
                if (animale instanceof Leon) {
                    tailLength = ((Leon) animale).getTailLenght();
                } else if (animale instanceof Tiger) {
                    tailLength = ((Tiger) animale).getTailLenght();
                }
                if (tailLength > maxCoda) {
                    species= animale.getClass().getSimpleName();
                    maxCoda = tailLength;
                    animaleTailMoreLong = animale;
                }
            }
        }

        System.out.println(species + " - " + animaleTailMoreLong.getName()+" è l'animale con la coda più lunga di: "+ maxCoda+"cm");
    }

    public static void MaxWingSpan(List<Animal> zoo) {
        double maxWingSpan = 0;
        Animal wingSpanAnimal = null;
        String species="";

        for (Animal animal : zoo) {
            if (animal instanceof Eagle) {
                double wingSpan = ((Eagle) animal).getWingspan();
                if (wingSpan > maxWingSpan) {
                    species= animal.getClass().getSimpleName();
                    maxWingSpan = wingSpan;
                    wingSpanAnimal = animal;
                }
            }
        }

        System.out.println(species + " - " + wingSpanAnimal.getName()+" è l'uccello con l'apertura alare più grande con: "+ maxWingSpan +"cm");
    }

    public static void Character(List<Animal> zoo) {
        for (Class<? extends Animal> species : List.of(Leon.class, Tiger.class, Eagle.class)) {
            double maxPeso = 0;
            double minPeso = Double.MAX_VALUE;
            double maxHeight = 0;
            double minHeight = Double.MAX_VALUE;
            String nameMaxPeso="";
            String nameMinPeso="";
            String nameMaxHeight="";
            String nameMinHeight="";


            for (Animal animale : zoo) {
                String nameAnimal="";
                if (species.isInstance(animale)) {
                    if (animale.getWeight() > maxPeso) {
                        nameMaxPeso=animale.getName();
                        maxPeso = animale.getWeight();
                    }
                    if (animale.getWeight() < minPeso) {
                        nameMinPeso=animale.getName();
                        minPeso = animale.getWeight();
                    }
                    if (animale.getHeight() > maxHeight) {
                        nameMaxHeight=animale.getName();
                        maxHeight = animale.getHeight();
                    }
                    if (animale.getHeight() < minHeight) {
                        nameMinHeight=animale.getName();
                        minHeight = animale.getHeight();
                    }
                }
            }


            System.out.println("Per la specie " + species.getSimpleName() + ":");
            System.out.println("Animale "+ nameMaxPeso +" più pesante: " + maxPeso);
            System.out.println("Animale "+ nameMinPeso +" più leggero: " + minPeso);
            System.out.println("Animale "+ nameMaxHeight +" più alto: " + maxHeight);
            System.out.println("Animale "+ nameMinHeight +" più basso: " + minHeight);
        }
    }
}
