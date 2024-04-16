package ingresso;

public class Main {
  public static void main(String[] args) {
    var iv = new IngressoVIP("Show de Rock", 100, 50);
    iv.info();
    System.out.println("--------");
    var i = new Ingresso("Show de Rock", 100);
    i.info();
  }
}
