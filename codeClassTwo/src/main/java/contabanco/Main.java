package contabanco;

public class Main {
  public static void main(String[] args) {
    var c1 = new Conta(111, "Joaquim", 2000, 500);

    c1.info();

    if (!c1.sacar(2000)) {
      System.out.println("Problema ao sacar");
    }

    if (!c1.depositar(-500)) {
      System.out.println("Problema ao depositar");
    }

    c1.info();

    var c2 = new Conta(222, "Maria", 4000, 600);

    c1.transferir(c2, 2000);
    c1.info();
    c2.info();
  }
}
