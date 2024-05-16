package org.example;

public class Euro extends Moeda {
  public Euro(double valor) {
    this.valor = valor;
  }

  @Override
  public void info() {
    System.out.println("Euro: " + valor);
  }

  @Override
  public double converter() {
    return valor * 5.58;
  }
}
