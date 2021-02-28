package de.seism0saurus.design.pattern.builder.complete.after;

public class Menu {
    private final FirstCourse firstCourse;
    private final MainCourse mainCourse;
    private final Dessert dessert;

    public Menu(FirstCourse firstCourse, MainCourse mainCourse, Dessert dessert) {
        this.firstCourse = firstCourse;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "First course: " + firstCourse +
                "\nMain course: " + mainCourse +
                "\nDessert: " + dessert;
    }
}
