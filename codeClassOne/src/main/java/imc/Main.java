package imc;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in).useLocale(Locale.US)) {

      System.out.print("Please write your weight in kg: ");
      var weight = scanner.nextDouble();

      System.out.print("Please write your height in meters: ");
      var height = scanner.nextDouble();

      var imc = weight / (height * height);
      System.out.printf("Your imc is: %.2f", imc);
    }
  }
}
