package aulateorica;

public class Singleton {
  private static Singleton instancia = null;
  public int numero;

  private Singleton() {
    numero = 20;
  }

  public static Singleton getInstance() {
    if (instancia == null) {
      instancia = new Singleton();
    }
    return instancia;
  }
}
