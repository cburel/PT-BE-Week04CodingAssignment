package week04;

import java.util.Random;
import java.util.Scanner;

public class Week04CodingAssignment {

  public static void main(String[] args) {
    // 1.
    // create array of int called ages
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    
    // subtract first element from last element, print
    System.out.println(ages[ages.length - 1] - ages[0]);
    
    // create array of ages2 with 9 elements
    int[] ages2 = new int[9];
    
    // populate ages2
    for (int i = 0; i < ages2.length; i++) {
      ages2[i] = i;
    }
    
    // subtract first element from last, print
    System.out.println(ages2[ages2.length - 1] - ages2[0]);
    
    // iterate through array 1 (ages) and calculate average age, print
    int sum = 0;
    for (int i : ages) {
      sum += i;
    }
    System.out.println(sum / ages.length);
    
    // 2.
    // create string array called names
    String[] names =  {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    // calculate average number of letters, print
    int avgLetters = 0;
    for (String str : names) {
      avgLetters += str.length();
    }
    System.out.println(avgLetters / names.length);
    
    // concatenate names together separated by spaces, print
    String concatNames = "";
    for (String str : names) {
      concatNames += str + " ";
    }
    System.out.println(concatNames);
    
    // 3. access the last element in an array by using array.length
    System.out.println(ages2.length);
    
    // 4. access the first element in an array by using array[0]
    System.out.println(ages2[0]);
    
    // 5.
    // create int array called nameLengths
    int[] nameLengths = new int[names.length];
    
    // iterate over names and add the length of each name to nameLengths
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] += names[i].length();
    }
    
    // calculate sum of elements in nameLengths, print
    int nameLengthsSum = 0;
    for (int i : nameLengths) {
      nameLengthsSum += i;
    }
    System.out.println(nameLengthsSum);
    
    // 7. concatenates a string str for num amount of times
    System.out.println(concatWord("Hello", 3));
    
    // 8. take firstName and lastName, return full name separated by a space
    System.out.println(printFullName("Sally", "Smith"));
    
    
    // 9. if sum of all ints in array is > 100, returns true
    int[] nums = {50, 35, 12, 44};
    System.out.println(sumInts(nums));
    
    // 10. returns average of elements in array of doubles
    double[] doubles = {65.0, 35.5, 25.3};
    System.out.println(averageDouble(doubles));
    
    // 11. take two arrays of double, return true if avg of
    // elements in array 1 is greater than that of array 2
    double[] doubleAvg1 = {65.0, 35.5, 25.3};
    double[] doubleAvg2 = {15.4, 30.2, 1.1};
    System.out.println(compareDoubleAverages(doubleAvg1, doubleAvg2));
    
    // 12. write willBuyDrink, returns true if it is hot outside
    // and if money in pocket is greater than 10.50;
    boolean isHotOutside = true;
    double moneyInPocket = 12.50;
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
    
    // 13. Create a method of your own that solves a problem.
    // In comments, write what the method does and why you
    //created it.
    Scanner sc = new Scanner(System.in);
    boolean quit = false;
    
    do {
      System.out.println("Roll a die of how many sides? (3-20). 0 to quit.");
      int sides = sc.nextInt();
      sc.nextLine();
      
      if (sides == 0) {
        System.out.println("Goodbye!");
        quit = true;
      }
      else if (sides < 3 || sides > 20) {
        System.out.println("Must have 3-20 sides!");
      }
      else {
        System.out.println("You rolled a " + rollDie(sides));
      }
      
    } while (!quit);
    
  }
  
  // 7. concatenates a string str for num amount of times
  public static String concatWord(String str, int num) {
    String result = "";
    
    for (int i = 0; i < num; i++) {
      result += str;
    }
    
    return result;
  }
  
  // 8. take firstName and lastName, return full name separated by a space
  public static String printFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  // 9. if sum of all ints in array is > 100, returns true
  public static boolean sumInts(int[] nums) {
    int sum = 0;
    
    for (int i : nums) {
      sum += i;
    }
    
    if (sum > 100) {
      return true;
    }
    
    return false;
    
  }
  
  // 10. returns average of elements in array of doubles
  public static double averageDouble(double[] doubles) {
     double average = 0.0;
     
     for (double db : doubles) {
       average += db;
     }
    
     return average / doubles.length;
  }

  // 11. take two arrays of double, return true if avg of
  // elements in array 1 is greater than that of array 2
  public static boolean compareDoubleAverages(double[] db1, double[] db2) {
    double avg1 = 0.0;
    double avg2 = 0.0;
    
    for (double db : db1) {
      avg1 += db;
    }
    for (double db: db2) {
      avg2 += db;
    }
    
    avg1 = avg1 / db1.length;
    avg2 = avg2 / db2.length;
    
    if (avg1 > avg2) {
      return true;
    }
     
    return false;
  }
  
  // 12. write willBuyDrink, returns true if it is hot outside
  // and if money in pocket is greater than 10.50;
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    
    if (isHotOutside && moneyInPocket > 10.50) {
      return true;
    }
    
    return false;
    
  }
  
  // 13. Create a method of your own that solves a problem.
  // In comments, write what the method does and why you
  //created it.
  public static int rollDie(int sides) {
    Random rand = new Random();
    int result = rand.nextInt(sides);
    return result;
    
  }
}
