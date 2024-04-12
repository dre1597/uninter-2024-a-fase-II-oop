package leonidas;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Try your luck: ");
      var number = scanner.nextInt();

      while (number != 300) {
        if (number > 300) {
          System.out.print("Too high, try again: ");
        } else {
          System.out.print("Too low, try again: ");
        }
        number = scanner.nextInt();
      }

      System.out.println("Congratulations!");

    }
  }
}
