import animals.Animal;
import metods.Metods;
import species.Eagle;
import species.Leon;
import species.Tiger;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Leon leone1 = new Leon("King", "Carne", 5, "01/01/2020", 150, 120, 90);
        Leon leone2 = new Leon("Alex", "Carne", 6, "01/02/2020", 160, 125, 85);

        Tiger tigre1 = new Tiger("Raja", "Carne", 4, "01/03/2020", 140, 110, 80);
        Tiger tigre2 = new Tiger("Tigre", "Carne", 7, "01/04/2020", 155, 115, 75);

        Eagle aquila1 = new Eagle("Eagle", "Pesce", 3, "01/05/2020", 10, 40, 60);
        Eagle aquila2 = new Eagle("Aquila", "Topi", 5, "01/06/2020", 12, 35, 70);


        List<Animal> zoo = new ArrayList<>();
        zoo.add(leone1);
        zoo.add(leone2);
        zoo.add(tigre1);
        zoo.add(tigre2);
        zoo.add(aquila1);
        zoo.add(aquila2);

        // Metods
        Metods.TailMoreLong(zoo);
        Metods.MaxWingSpan(zoo);
        Metods.Character(zoo);
    }




}


