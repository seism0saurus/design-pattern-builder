package de.seism0saurus.design.pattern.builder.complete.after;

public class Chef {

    public Menu cook(Recipe recipe){
        return menu(recipe.firstCourse(), recipe.mainCourse(), recipe.dessert());
    }

    private Menu menu(FirstCourse firstCourse, MainCourse mainCourse, Dessert dessert) {
        return new Menu(firstCourse,mainCourse,dessert);
    }
}
