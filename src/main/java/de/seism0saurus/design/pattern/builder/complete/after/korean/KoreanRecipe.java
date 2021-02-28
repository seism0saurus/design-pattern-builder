package de.seism0saurus.design.pattern.builder.complete.after.korean;

import de.seism0saurus.design.pattern.builder.complete.after.*;

public class KoreanRecipe implements Recipe {
    @Override
    public FirstCourse firstCourse() {
        return new KoreanSpringRoll();
    }

    @Override
    public MainCourse mainCourse() {
        return new TofuWithVegetables();
    }

    @Override
    public Dessert dessert() {
        return new HoneyCakeFromRice();
    }
}
