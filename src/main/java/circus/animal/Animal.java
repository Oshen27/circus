package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {
    public static Comparator<Animal> animalNameComparator = new Comparator<Animal>() {
        public int compare(Animal animal1, Animal animal2) {
            return animal1.name.compareToIgnoreCase(animal2.name);
        }
    };
    public String name;
    public abstract String speak();
}
