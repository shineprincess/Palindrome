import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Palindrome in Java");

    System.out.println("Enter a String to check a given String is palindrome or not ");

    Scanner sc = new Scanner(System.in);

    String original = sc.nextLine();

    String reverseString = "";
  //  char [] characters = original.toCharArray();
    for(int i=original.length()-1; i>=0; i--) {
      reverseString += original.charAt(i);
    }

    if(original.equals(reverseString)) {
      System.out.println("String   " + original + " is Palindrome !!..");
    } else {
        System.out.println("String " + original + " is Not  Palindrome");
    }
  }
}


        