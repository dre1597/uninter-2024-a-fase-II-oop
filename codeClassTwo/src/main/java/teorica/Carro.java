package teorica;

public class Carro {
  static final double PI = 3.1515;
  String nome;
  String modelo;
  float velocidade;

  static float milhasParaMetros(float milhas) {
    return milhas * 1609.34f;
  }
}
