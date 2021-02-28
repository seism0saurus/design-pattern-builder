package de.seism0saurus.design.pattern.builder.complete.after.vegetarian;

import de.seism0saurus.design.pattern.builder.complete.after.*;

public class VegetarianRecipe implements Recipe {

    @Override
    public FirstCourse firstCourse() {
        return new TomatoMozzarellaPesto();
    }

    @Override
    public MainCourse mainCourse() {
        return new CeleryCutlet();
    }

    @Override
    public Dessert dessert() {
        return new ChocolateLavaCake();
    }
}
