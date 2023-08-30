package species;

import animals.Animal;

public class Leon extends Animal {

    private int tailLenght;



    public int getTailLenght() {
        return tailLenght;
    }

    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }

    public Leon(String name, String favoriteFood, int age, String dateIn, float weight, float height, int tailLenght) {
        super(name, favoriteFood, age, dateIn, weight, height);
        this.tailLenght= tailLenght;
    }
}
