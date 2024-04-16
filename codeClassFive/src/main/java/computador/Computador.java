package computador;

public abstract class Computador {
  int gbMemoria;
  int numProcessadores;

  Computador(int gbMemoria, int numProcessadores) {
    super();
    this.gbMemoria = gbMemoria;
    this.numProcessadores = numProcessadores;
  }

  abstract double calculaValor();
}
