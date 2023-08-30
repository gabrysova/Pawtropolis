package animals;

import java.util.Date;

public class Animal {

    private String name;
    private String favoriteFood;
    private int age;
    private String dateIn;
    private float weight;
    private float height;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Animal(String name, String favoriteFood, int age, String dateIn, float weight, float height) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.dateIn = dateIn;
        this.weight = weight;
        this.height = height;
    }
}
