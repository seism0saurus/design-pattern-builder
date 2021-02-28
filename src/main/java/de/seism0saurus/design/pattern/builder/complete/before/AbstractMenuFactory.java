package de.seism0saurus.design.pattern.builder.complete.before;

import de.seism0saurus.design.pattern.builder.complete.before.korean.KoreanMenuFactory;
import de.seism0saurus.design.pattern.builder.complete.before.mexican.MexicanMenuFactory;
import de.seism0saurus.design.pattern.builder.complete.before.vegetarian.VegetarianMenuFactory;

public abstract class AbstractMenuFactory {

    public static MenuFactory getFactory(Flavour flavour) {
        return switch (flavour) {
            case VEGETARIAN -> new VegetarianMenuFactory();
            case MEXICAN -> new MexicanMenuFactory();
            case KOREAN -> new KoreanMenuFactory();
        };
    }
}
