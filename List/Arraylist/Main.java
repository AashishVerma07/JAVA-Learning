import java.util.*;
class Main {
  public static void main(String[] args) {

  ArrayList <Integer> number = new ArrayList<>();
    //Add elements in ArrayList.
    System.out.println("Add elements in ArrayList");
    number.add(10);
    number.add(20);
    number.add(50);
    number.add(60);
    System.out.println(number);

    //Add elements in particular position.
    System.out.println("Add elements in particular position");
    number.add(1, 90);
    System.out.println(number);

    // Remove elements from number.
    System.out.println("Remove elements from number");
    number.remove(2);
    System.out.println(number);

    // Get size of given array
    System.out.println("Get size of given array");
    System.out.println(number.size());

    // Update element.
    System.out.println("Update element");
    // number.set(0, 5);

    // Get elements
    System.out.println("Get Elements" + number.get(3));
  }
}