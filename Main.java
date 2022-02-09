 /*
 * Program Title: User Proofing
 * Author: Hayden Mankin
 * Date: 2/8/2021
 * Purpose: Demonstrate how to use try-catch statements to enhance user proofing.
 * Modified By: 
 * Date Modified:
 */

import java.util.*;
import java.io.*;

public class Main {
  static Scanner fileIn;
 
  public static String getStringFromFile() {
    String input = fileIn.nextLine();
    return input;
  }

  // TODO: ADD A THROWS CLAUSE FOR ANY POSSIBLE EXCEPTIONS THAT MIGHT POP UP.
  public static int getIntFromFile() {
    int input = fileIn.nextInt();
    fileIn.nextLine();
    return input;
  }

  // TODO: ADD A THROWS CLAUSE FOR ANY POSSIBLE EXCEPTIONS THAT MIGHT POP UP.
  public static boolean getBooleanFromFile() {
    boolean input = fileIn.nextBoolean();
    fileIn.nextLine();
    return input;
  }

  // TODO: ADD A THROWS CLAUSE FOR ANY POSSIBLE EXCEPTIONS THAT MIGHT POP UP.
  public static Animal readAnimalFromFile() {
    String name = getStringFromFile();
    String species = getStringFromFile();
    String noise = getStringFromFile();
    int numLegs = getIntFromFile();
    boolean vegetarian = getBooleanFromFile();

    Animal newAnimal = new Animal(name, species, noise, numLegs, vegetarian);

    return newAnimal;
  }

  public static int getIntFromConsole(Scanner in) {
    // TODO: MODIFY THE CODE TO FORCE THE USER TO GIVE AN INTEGER. DO NOT LEAVE THIS METHOD UNTIL THE USER HAS ENTERED AN INTEGER.
    int input = in.nextInt();
    in.nextLine();
    return input;
  }

  public static String getStringFromConsole(Scanner in) {
    String input = in.nextLine();
    return input;
  }

  // TODO: ADD CODE THAT WILL DISPLAY ALL ANIMALS IN THE `animals` ARRAYLIST.
  public static void displayAnimal(ArrayList<Animal> animals) {

  }

  // TODO: ADD CODE THAT WILL CALL A RANDOM ANIMALS `makeNoise()` METHOD FROM THE `animals` ARRAYLIST
  public static void makeRandomNoise(ArrayList<Animal> animals) {

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("How many files would you like me to read? ");
    int numAnimals = getIntFromConsole(in);

    ArrayList<Animal> animals = new ArrayList<>();

    // TODO: MODIFY CODE TO ASK USER numAnimals TIMES FOR A FILE TO READ.

    // TODO: USER PROOF. KEEP ASKING USER UNTIL A VALID FILE IS GIVEN
    System.out.print("Enter a file name: ");
    String fileName = getStringFromConsole(in);
    
    in.close();
    
    fileIn = new Scanner(new File(fileName));

    // TODO: USER PROOF. IF THE FILE IS NOT FORMATTED CORRECTLY PRINT AN ERROR MESSAGE AND CONTINUE RUNNING THE PROGRAM. THIS **WILL** COUNT AS A FILE IN THE COUNT numAnimals
    Animal newAnimal = readAnimalFromFile();
    animals.add(newAnimal);

    displayAnimal(animals);

    makeRandomNoise(animals);
  }
}
