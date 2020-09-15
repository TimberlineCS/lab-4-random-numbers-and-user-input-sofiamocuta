import java.io.*;
import java.util.*;
public class Lab4{
  public static void main(String args[]){
    //Challenge 1
    Scanner RandNumb = new Scanner(System.in); 

    System.out.println("Type in a whole negative number");
    int firstNumb = RandNumb.nextInt();
    int x = firstNumb * -1;
    System.out.println("Type in a whole positive number that is greater than " + x );
    int secondNumb = RandNumb.nextInt();
    int range = secondNumb - firstNumb;
    int output1 = (int)(Math.random()*range + firstNumb);
    int output2 = (int)(Math.random()*range + firstNumb);
    System.out.println("You got " + output1 + " and " + output2 + ".");
    //Challenge 2
    Scanner madLibs = new Scanner(System.in);

    System.out.println("A noun? (plural)");
    String noun = madLibs.nextLine();
    System.out.println("A name with 's?");
    String name = madLibs.nextLine();
    System.out.println("A kind of person? ((ex. Dad, landlord, etc.))");
    String person = madLibs.nextLine();
    System.out.println("Any number wtih 2 decimals?");
    String d = madLibs.nextLine();
    System.out.println("A whole number");
    int b = madLibs.nextInt();
    System.out.println("For " + name + " birthday their " + person +" got them "+ b + " " + noun + " for just $" + d);   
  }
}