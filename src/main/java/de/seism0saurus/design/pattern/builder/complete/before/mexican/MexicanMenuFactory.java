package de.seism0saurus.design.pattern.builder.complete.before.mexican;

import de.seism0saurus.design.pattern.builder.complete.before.Dessert;
import de.seism0saurus.design.pattern.builder.complete.before.FirstCourse;
import de.seism0saurus.design.pattern.builder.complete.before.MainCourse;
import de.seism0saurus.design.pattern.builder.complete.before.MenuFactory;

public class MexicanMenuFactory implements MenuFactory {

    @Override
    public FirstCourse getFirstCourse() {
        return new NopalitosSalad();
    }

    @Override
    public MainCourse getMainCourse() {
        return new Enchiladas();
    }

    @Override
    public Dessert getDesert() {
        return new OrangeBiscuits();
    }
}
