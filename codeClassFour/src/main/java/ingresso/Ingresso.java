package ingresso;

public class Ingresso {
  String nomeEvento;
  double valor;

  public Ingresso(String nomeEvento, double valor) {
    super();
    this.nomeEvento = nomeEvento;
    this.valor = valor;
  }

  void info() {
    System.out.println("Nome do evento: " + nomeEvento);
    System.out.println("Valor do ingresso: " + valor);
  }
}
