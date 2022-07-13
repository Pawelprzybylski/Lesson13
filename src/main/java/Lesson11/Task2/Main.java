package Lesson11.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Pizza> pizzas = Arrays.asList(
                new Pizza(true, 500, "Pizza1", "Mozzarela", "Cebula", "Pomidor"),
                new Pizza(true, 400, "Pizza2", "Mozzarela", "Seler", "Cebula"),
                new Pizza(false, 300, "Pizza3", "Mozzarela", "Salami", "Pomidor"),
                new Pizza(false, 600, "Pizza4", "Salami", "Cebula", "Papryka"),
                new Pizza(true, 650, "Pizza5", "Seler", "Cebula", "Pomidor"),
                new Pizza(false, 700, "Pizza6", "Mozzarela", "Cebula", "Salami"),
                new Pizza(false, 750, "Pizza7", "Papryka", "Cebula", "Pomidor"),
                new Pizza(true, 800, "Pizza8", "Seler", "Cebula", "Pomidor"),
                new Pizza(false, 850, "Pizza9", "Salami", "Cebula", "Pomidor"),
                new Pizza(true, 900, "Pizza10", "Pieczarki", "Cebula", "Pomidor")
        );

        System.out.println("Dania wegetariańskie: ");
        List<Pizza> vegetarianPizzas = pizzas.stream()
                .filter(pizza -> pizza.isVegetarian())
                .collect(Collectors.toList());
        vegetarianPizzas.forEach(System.out::println);

        System.out.println("Pizze zawierające alergeny-Seler: ");
        List<Pizza> allergenPizza = pizzas.stream()
                .filter(pizza -> pizza.getIngredient1() == "Seler" || pizza.getIngredient2() == "Seler" || pizza.getIngredient3() == "Seler")
                .collect(Collectors.toList());
        allergenPizza.forEach(System.out::println);

        System.out.println("Czy istnieje jakaś pizza wegeteriańska zawierająca pomidora oraz paprykę?");
        boolean isVegetarianPizzaContainsTomatoAndPaprik = pizzas.stream()
                .anyMatch(pizza -> pizza.isVegetarian() && pizza.getIngredient1() == "Pomidor" || pizza.getIngredient1() == "Papryka" &&
                        pizza.getIngredient2() == "Pomidor" || pizza.getIngredient2() == "Papryka" && pizza.getIngredient3() == "Pomidor" || pizza.getIngredient3() == "Papryka");
        System.out.println(isVegetarianPizzaContainsTomatoAndPaprik);

        System.out.println("Czy wszystkie pizze zawieraja mozzarela?");
        boolean isAllPizzzasContainsMozzarela = pizzas.stream()
                .allMatch(pizza -> pizza.getIngredient1() == "Mozzarela" || pizza.getIngredient2() == "Mozzarela" || pizza.getIngredient3() == "Mozzarela");
        System.out.println(isAllPizzzasContainsMozzarela);

        System.out.println("Pizza o najwyższej kaloryczności");
        List<Pizza> highestCaloriePizza = pizzas.stream()
                .filter(pizza -> pizza.getCalories() >= 900)
                .collect(Collectors.toList());
        highestCaloriePizza.forEach(System.out::println);

        System.out.println("Pizza o najniższej kaloryczności");
        List<Pizza> lowestCaloriePizza = pizzas.stream()
                .filter(pizza -> pizza.getCalories() <= 300)
                .collect(Collectors.toList());
        lowestCaloriePizza.forEach(System.out::println);

    }

}