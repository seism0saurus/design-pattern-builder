package de.seism0saurus.design.pattern.builder.simplified.before;

public class Example {

    public static void main(String[] args) {
        Pizza margherita = new Pizza("italian", "mozzarella", "tomato", null, "basil");
        System.out.println(margherita);

        Pizza cheese = new Pizza("italian", "gauda", null, null, "cheddar");
        System.out.println(cheese);

        Pizza salami = new Pizza("italian", "emmental", null, "salami");
        System.out.println(salami);
    }
}
