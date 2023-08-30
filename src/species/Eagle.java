package species;

import animals.Animal;

public class Eagle extends Animal {


    private int wingspan;


    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public Eagle(String name, String favoriteFood, int age, String dateIn, float weight, float height, int wingspan) {
        super(name, favoriteFood, age, dateIn, weight, height);
        this.wingspan=wingspan;
    }

}
