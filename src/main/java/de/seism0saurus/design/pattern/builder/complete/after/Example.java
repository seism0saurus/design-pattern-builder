package de.seism0saurus.design.pattern.builder.complete.after;

import de.seism0saurus.design.pattern.builder.complete.after.korean.KoreanRecipe;
import de.seism0saurus.design.pattern.builder.complete.after.mexican.Enchiladas;
import de.seism0saurus.design.pattern.builder.complete.after.vegetarian.ChocolateLavaCake;
import de.seism0saurus.design.pattern.builder.complete.after.vegetarian.TomatoMozzarellaPesto;

public class Example {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Menu menu = chef.cook(new KoreanRecipe());
        System.out.println(menu);

        Recipe customRecipe = new Recipe() {
            @Override
            public FirstCourse firstCourse() {
                return new TomatoMozzarellaPesto();
            }

            @Override
            public MainCourse mainCourse() {
                return new Enchiladas();
            }

            @Override
            public Dessert dessert() {
                return new ChocolateLavaCake();
            }
        };
        menu = chef.cook(customRecipe);
        System.out.println(menu);
    }
}
