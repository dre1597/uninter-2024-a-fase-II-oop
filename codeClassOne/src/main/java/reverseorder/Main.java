package reverseorder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var names = new ArrayList<String>();

    try(var scanner = new Scanner(System.in)) {
      String message;
      System.out.print("How many names do you want to enter? ");
      var numberOfNames = scanner.nextInt();

      for (var i = 0; i < numberOfNames; i++) {
        System.out.print("Please enter a name: ");
        message = scanner.next();
        names.add(message);
      }

      System.out.println("Normal order:");
      for (var name : names) {
        System.out.println(name);
      }

      System.out.println("Reversed order:");
      for (var i = names.size() - 1; i >= 0; i--) {
        System.out.println(names.get(i));
      }
    }
  }
}
