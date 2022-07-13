package Lesson11.Task2;

public class Pizza {
    private final boolean vegetarian;
    private final int calories;
    private final String name;
    private final String ingredient1;
    private final String ingredient2;
    private final String ingredient3;

    public Pizza(boolean vegetarian, int calories, String name, String ingredient1, String ingredient2, String ingredient3) {
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.name = name;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public String getIngredient3() {
        return ingredient3;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", name='" + name + '\'' +
                ", ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                ", ingredient3='" + ingredient3 + '\'' +
                '}';
    }
}
