package org.example;

import java.util.ArrayList;

public class Cofrinho {
  private ArrayList<Moeda> listaMoedas;

  public Cofrinho() {
    listaMoedas = new ArrayList<Moeda>();
  }

  public void adicionar(Moeda moeda) {
    listaMoedas.add(moeda);
  }

  public void remover(Moeda moeda) {
    listaMoedas.remove(moeda);
  }

  public void listagemMoedas() {
    if(listaMoedas.isEmpty()) {
      System.out.println("Cofrinho vazio");
      return;
    }

    for(var i = 0; i < listaMoedas.size(); i++) {
      System.out.print((i + 1) + " - ");
      listaMoedas.get(i).info();
    }
  }

  public double totalConvertido() {
    double total = 0;

    for(Moeda moeda: listaMoedas) {
      total += moeda.converter();
    }

    return total;
  }
}
