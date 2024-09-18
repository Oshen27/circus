package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

import static circus.animal.Animal.animalNameComparator;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        Elephant eli = new Elephant("Eli");
        animalArrayList.add(eli);

        Duck elsa = new Duck("Elsa");
        animalArrayList.add(elsa);

        System.out.println("Before sorting... ");

        printAllAnimals(animalArrayList);
        printNumberOfAnimals(animalArrayList);
        System.out.println("Eli is in position: " + (animalArrayList.indexOf(eli)+1));

        animalArrayList.sort(animalNameComparator);
        System.out.println("After sorting...");
        printAllAnimals(animalArrayList);
//        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    private static void printNumberOfAnimals(ArrayList<Animal> animalArrayList) {
        System.out.println("Number of animals in the arraylist: " + animalArrayList.size());
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }
}
