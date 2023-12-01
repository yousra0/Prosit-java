package tn.esprit.gestionzoo.entities;


public class AquaticAnimal extends Animal
{
    private String habitat;

    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }


    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

    public void swim()
    {
        System.out.println("This aquatic animal is swimming.");
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AquaticAnimal that = (AquaticAnimal) o;

        if (getAge() != that.getAge()) return false;
        if (!getName().equals(that.getName())) return false;
        return getHabitat().equals(that.getHabitat());
    }


    public int hashCode()
    {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getHabitat().hashCode();
        return result;
    }




}


//super est utilisée en programmation orientée objet en Java pour faire référence
// à la classe parente (la superclasse) à partir de laquelle une classe dérivée
// (la sous-classe) est étendue ou héritée
