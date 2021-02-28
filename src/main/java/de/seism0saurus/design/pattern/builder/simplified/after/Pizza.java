package de.seism0saurus.design.pattern.builder.simplified.after;

public class Pizza {

    private final String base;
    private final String cheese;
    private final String vegetable;
    private final String meat;
    private final String extra;

    private Pizza(String base, String cheese, String vegetable, String meat, String extra) {
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

    public static class Builder {
        private String base;
        private String cheese;
        private String vegetable;
        private String meat;
        private String extra;

        public Builder base(String base) {
            this.base = base;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder vegetable(String vegetable) {
            this.vegetable = vegetable;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        public Pizza build(){
            return new Pizza(base,cheese,vegetable,meat,extra);
        }
    }
}
