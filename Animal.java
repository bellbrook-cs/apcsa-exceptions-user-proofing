/*
 * Program Title: Animal Class
 * Author: Hayden Mankin
 * Date: 2/8/2021
 * Purpose: Store all data pertaining to some animal. Provide methods for interacting with the animals properties
 */

public class Animal {
  private String name;
  private String species;
  private String noise;
  private int numLegs;
  private boolean vegetarian;

  public Animal(String name, String species, String noise, int numLegs, boolean vegetarian) {
    this.name = name;
    this.species = species;
    this.noise = noise;
    this.numLegs = numLegs;
    this.vegetarian = vegetarian;
  }

  public String toString() {
    return "I am a " + species + " named " + name + ".";
  }

  public void makeNoise() {
    System.out.println();
    System.out.println(noise);
    System.out.println();
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public int getNumLegs() {
    return numLegs;
  }
}
