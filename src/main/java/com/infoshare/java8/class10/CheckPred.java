package com.infoshare.java8.class10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class CheckPred {

    public static void main(String[] args) {

        Predicate<String> stringPredicate = x -> x.isEmpty();
        stringPredicate.test("");

        Consumer<String> stringConsumer = x -> {
            System.out.println(x.toUpperCase());
            System.out.println(x.toUpperCase());
        };
        stringConsumer.accept("Elo");

        Function<String, Integer> stringIntegerFunction = x -> Integer.parseInt(x) * 2;
//        Function<String, Integer> stringIntegerFunction = x -> Integer.valueOf(x) * 2;

        System.out.println(stringIntegerFunction.apply("7"));

        Predicate<Apple> applePredicate = x -> x.color.equals("red");
        Predicate<Apple> appleNotRed = applePredicate.negate();
        Predicate<Apple> weightAbove100 = x -> x.weight > 100;

        Predicate<Apple> redAndWeightAbove100 = applePredicate.and(weightAbove100);

        Apple goldApple = new Apple("red", 189);

        System.out.println(applePredicate.test(goldApple));

        Consumer<String> displayString = x -> System.out.println(x);
        Consumer<String> displayStr = System.out::println;

        String sample = "Sample";

        displayString.accept(sample);
        displayStr.accept(sample);

        int myNumber = 10;
        Function<Integer, Integer> toSquare = ToSquare::toSquare;
        System.out.println(toSquare.apply(myNumber));

        int mySecNumber = 5;
//        Function<Integer, Integer> divide = (x, y) -> x/y;
//        divide.apply(myNumber, mySecNumber);

        Dish dish1 = new Dish("wątróbka", 1500);
        Dish dish2 = new Dish("pizza", 2500);
        Dish dish3 = new Dish("jabłko", 399);
        Dish dish4 = new Dish("ogórek", 150);
        Dish dish5 = new Dish("miś", 240);

        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);

        System.out.println(getLowCaloricDishesNames(dishes));

    }

    public static List<String> getLowCaloricDishesNames(List<Dish> dishes) {
        return dishes.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
    }

}
