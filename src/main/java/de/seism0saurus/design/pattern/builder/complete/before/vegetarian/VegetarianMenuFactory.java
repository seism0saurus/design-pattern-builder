package de.seism0saurus.design.pattern.builder.complete.before.vegetarian;

import de.seism0saurus.design.pattern.builder.complete.before.Dessert;
import de.seism0saurus.design.pattern.builder.complete.before.FirstCourse;
import de.seism0saurus.design.pattern.builder.complete.before.MainCourse;
import de.seism0saurus.design.pattern.builder.complete.before.MenuFactory;

public class VegetarianMenuFactory implements MenuFactory {

    @Override
    public FirstCourse getFirstCourse() {
        return new TomatoMozzarellaPesto();
    }

    @Override
    public MainCourse getMainCourse() {
        return new CeleryCutlet();
    }

    @Override
    public Dessert getDesert() {
        return new ChocolateLavaCake();
    }
}
