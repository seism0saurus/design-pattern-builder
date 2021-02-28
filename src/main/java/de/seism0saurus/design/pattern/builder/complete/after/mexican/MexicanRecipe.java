package de.seism0saurus.design.pattern.builder.complete.after.mexican;

import de.seism0saurus.design.pattern.builder.complete.after.*;

public class MexicanRecipe implements Recipe {

    @Override
    public FirstCourse firstCourse() {
        return new NopalitosSalad();
    }

    @Override
    public MainCourse mainCourse() {
        return new Enchiladas();
    }

    @Override
    public Dessert dessert() {
        return new OrangeBiscuits();
    }
}
