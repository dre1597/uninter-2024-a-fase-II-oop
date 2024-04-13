package conditionalandloops;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var age = 10;
    var weight = 80.5;
    var name = "John";
    name = "Jane";

    if (age > 18) {
      System.out.println("Adult");
    }

    for (var i = 0; i < 10; i++) {
      System.out.println(i);
    }

    int[] megasena1 = {11,34,43,22,45,17};
    int[] megasena2 = new int[6];

    for (var i = 0; i < 6; i++) {
      System.out.println(megasena1[i]);
    }

    for (var i = 0; i < 6; i++) {
      System.out.println(megasena2[i]);
    }

    try(var scanner = new Scanner(System.in)){
      System.out.print("Please write your name: ");
      name = scanner.nextLine();
      System.out.println(name);
    }
  }
}
