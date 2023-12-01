package tn.esprit.gestionzoo.entities;

public class Dolphin extends AquaticAnimal
{
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    /*
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

     */
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    public class Penguin extends AquaticAnimal {
        public Penguin(String family, String name, int age, boolean isMammal, String habitat) {
            super(family, name, age, isMammal, habitat);
        }


        @Override
        public void swim() {
            System.out.println("The penguin is swimming in the icy waters.");
        }
    }
}
