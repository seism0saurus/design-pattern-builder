package de.seism0saurus.design.pattern.builder.complete.before;

public interface MenuFactory {

    FirstCourse getFirstCourse();

    MainCourse getMainCourse();

    Dessert getDesert();
}
