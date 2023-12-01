package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);


////////////////////////////////////////////////////////////////
        // Create an instance of TerrestrialAnimal using the default constructor
       /* TerrestrialAnimal defaultTerrestrialAnimal = new TerrestrialAnimal("Mammal", "DefaultTerrestrial", 0, true, 4);

        // Create an instance of AquaticAnimal using the default constructor
        AquaticAnimal defaultAquaticAnimal = new AquaticAnimal("Fish", "DefaultAquatic", 0, true, "Underwater");

        // Create an instance of Dolphin using the default constructor
        Dolphin defaultDolphin = new Dolphin("Dolphin Family", "DefaultDolphin", 0, true, "Ocean", 0.0f);

        // Create an instance of Penguin using the default constructor
        Penguin defaultPenguin = new Penguin("Penguin Family", "DefaultPenguin", 0, true, "Ice", 0.0f);

        // Display the created instances
        //System.out.println(defaultAnimal);
        System.out.println(defaultTerrestrialAnimal);
        System.out.println(defaultAquaticAnimal);
        System.out.println(defaultDolphin);
        System.out.println(defaultPenguin);*/
  ////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Create instances of the classes with parameterized constructors
       /* TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal("Mammal", "Lion", 5, true, 4);
        AquaticAnimal aquaticAnimal = new AquaticAnimal("Fish", "Shark", 10, true, "Ocean");
        Dolphin dolphin = new Dolphin("Dolphin Family", "Flipper", 8, true, "Ocean", 25.0f);
        Penguin penguin = new Penguin("Penguin Family", "Pingo", 3, true, "Ice", 10.0f);

        // Display the created instances
        System.out.println(terrestrialAnimal);
        System.out.println(aquaticAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);*/

        ////////////////////////////////////////////////////////////////////////////////////////////////
        AquaticAnimal aquaticAnimal = new AquaticAnimal("Fish", "Shark", 10, true, "Ocean");
        Dolphin dolphin = new Dolphin("Dolphin Family", "Flipper", 8, true, "Ocean", 25.0f);
        Penguin penguin = new Penguin("Penguin Family", "Pingo", 3, true, "Ice", 10.0f);

        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();


/////////////////////////////////////////////////////////////////////////////

        AquaticAnimal shark = new AquaticAnimal("Shark Family", "Jaws", 15, true, "Ocean");
        AquaticAnimal octopus = new AquaticAnimal("Octopus Family", "Inky", 2, false, "Ocean");

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(shark);
        myZoo.addAquaticAnimal(octopus);

        myZoo.displayAquaticAnimals();

        myZoo.swimAllAquaticAnimals();

        myZoo.displayNumberOfAquaticsByType();


    }

}
