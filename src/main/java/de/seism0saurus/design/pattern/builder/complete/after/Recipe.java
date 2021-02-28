package de.seism0saurus.design.pattern.builder.complete.after;

public interface Recipe {
    FirstCourse firstCourse();
    MainCourse mainCourse();
    Dessert dessert();
}
