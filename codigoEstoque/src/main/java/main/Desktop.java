package main;

public class Desktop extends Computador {
  double acessorios;

  public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
    super(gbMemoria, numProcessadores);
    this.acessorios = acessorios;
  }

  @Override
  public String toString() {
    return "main.Desktop [acessorios=" + acessorios + ", gbMemoria=" + gbMemoria + ", numProcessadores="
        + numProcessadores + ", Valor=" + calculaValor() + "]";
  }

  @Override
  double calculaValor() {
    return 200 * gbMemoria + 400 * numProcessadores + acessorios;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(acessorios);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Desktop other = (Desktop) obj;
    if (Double.doubleToLongBits(acessorios) != Double.doubleToLongBits(other.acessorios))
      return false;
    return true;
  }


}
