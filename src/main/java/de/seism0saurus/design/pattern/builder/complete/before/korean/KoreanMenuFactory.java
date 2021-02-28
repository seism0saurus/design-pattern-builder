package de.seism0saurus.design.pattern.builder.complete.before.korean;

import de.seism0saurus.design.pattern.builder.complete.before.Dessert;
import de.seism0saurus.design.pattern.builder.complete.before.FirstCourse;
import de.seism0saurus.design.pattern.builder.complete.before.MainCourse;
import de.seism0saurus.design.pattern.builder.complete.before.MenuFactory;

public class KoreanMenuFactory implements MenuFactory {

    @Override
    public FirstCourse getFirstCourse() {
        return new KoreanSpringRoll();
    }

    @Override
    public MainCourse getMainCourse() {
        return new TofuWithVegetables();
    }

    @Override
    public Dessert getDesert() {
        return new HoneyCakeFromRice();
    }
}
