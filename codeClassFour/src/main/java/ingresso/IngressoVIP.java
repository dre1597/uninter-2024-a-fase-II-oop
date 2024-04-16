package ingresso;

public class IngressoVIP extends Ingresso {
  double adicional;

  public IngressoVIP(String nomeEvento, double valor, double adicional) {
    super(nomeEvento, valor);
    this.adicional = adicional;
  }

  @Override
  public void info() {
    super.info();
    System.out.println("Adicional: " + adicional);
    System.out.println("Total: " + (valor + adicional));
  }
}
