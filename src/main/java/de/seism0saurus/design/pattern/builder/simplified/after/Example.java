package de.seism0saurus.design.pattern.builder.simplified.after;

public class Example {

    public static void main(String[] args) {
        Pizza margherita = new Pizza.Builder()
                .base("italian")
                .cheese("mozzarella")
                .vegetable("tomato")
                .extra("basil")
                .build();
        System.out.println(margherita);

        Pizza cheese = new Pizza.Builder()
                .base("italian")
                .cheese("gauda")
                .extra("cheddar")
                .build();
        System.out.println(cheese);

        Pizza salami = new Pizza.Builder()
                .base("italian")
                .cheese("emmental")
                .meat("salami")
                .build();
        System.out.println(salami);
    }
}
