package Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBasket<A extends Fruit> {
    private List<A> fruits;

    public FruitBasket() {
        this.fruits = new ArrayList<>();
    }

    public FruitBasket(List<A> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    public FruitBasket(A... fruits) {
        this.fruits = new ArrayList<> (Arrays.asList(fruits));
    }

    public void add(A fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        int weight = 2;
        for (A fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean equalsByWeight(FruitBasket<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.1;
    }

    public void transferAll(FruitBasket<? super A> another) {
        if (this == another) return;
        another.getFruits().addAll(fruits);
        fruits.clear();
    }

    public List<A> getFruits() {
        return fruits;
    }
}