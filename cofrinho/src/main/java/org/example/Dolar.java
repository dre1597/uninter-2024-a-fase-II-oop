package org.example;

public class Dolar extends Moeda {
  public Dolar(double valor) {
    this.valor = valor;
  }

  @Override
  public void info() {
    System.out.println("Dolar: " + valor);
  }

  @Override
  public double converter() {
    return valor * 5.14;
  }
}
