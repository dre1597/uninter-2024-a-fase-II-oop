package moeda;

public class Main {
  public static void main(String[] args) {
    var c = new Cofrinho();

    c.add(new Moeda("Real", 5.0));
    c.add(new Moeda("Real", 5.0));
    c.add(new Moeda("Real", 5.0));

    System.out.println(c.calcularTotal());
  }
}
