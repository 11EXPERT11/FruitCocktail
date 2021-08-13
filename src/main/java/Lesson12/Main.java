package Lesson12;

public class Main {
    public static void main(String[] args) {
        FruitBasket<mango> appleFruitBasket = new FruitBasket<>(new mango(), new mango(), new mango());
        FruitBasket<tangerine> oranges = new FruitBasket<>(new tangerine(), new tangerine());

        System.out.println(appleFruitBasket.equalsByWeight(oranges));

        FruitBasket<tangerine> orangeFruitBasket = new FruitBasket<>(new tangerine());
    }}

