package week04;

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

}
