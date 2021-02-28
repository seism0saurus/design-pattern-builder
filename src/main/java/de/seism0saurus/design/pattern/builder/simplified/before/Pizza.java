package de.seism0saurus.design.pattern.builder.simplified.before;

public class Pizza {

    private final String base;
    private final String cheese;
    private final String vegetable;
    private final String meat;
    private final String extra;

    public Pizza(String base) {
        this(base, null);
    }

    public Pizza(String base, String cheese) {
        this(base, cheese, null);
    }

    public Pizza(String base, String cheese, String vegetable) {
        this(base, cheese, vegetable, null);
    }

    public Pizza(String base, String cheese, String vegetable, String meat) {
        this(base, cheese, vegetable, meat, null);
    }

    public Pizza(String base, String cheese, String vegetable, String meat, String extra) {
        this.base = base;
        this.cheese = cheese;
        this.vegetable = vegetable;
        this.meat = meat;
        this.extra = extra;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pizza with ").append(base).append(" base");
        if (cheese != null) {
            stringBuilder.append(" and with molten ").append(cheese);
        }
        if (vegetable != null) {
            stringBuilder.append(" and with sliced ").append(vegetable);
        }
        if (meat != null) {
            stringBuilder.append(" and with bits of ").append(meat);
        }
        if (extra != null) {
            stringBuilder.append(" and with extra ").append(extra);
        }
        return stringBuilder.toString();
    }
}
