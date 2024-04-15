package notas;

public class Nota {
  private double nota1;
  private double nota2;
  private int faltas;

  public Nota() {

  }

  public Nota(double nota1, double nota2, int faltas) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.faltas = faltas;
  }

  public int getFaltas() {
    return faltas;
  }

  public void setFaltas(int faltas) {
    if (faltas < 0) {
      System.out.println("Faltas inválidas");
      return;
    }
    this.faltas = faltas;
  }

  public double getNota1() {
    return nota1;
  }

  public void setNota1(double nota1) {
    if (nota1 < 0 || nota1 > 10) {
      System.out.println("Nota inválida");
      return;
    }
    this.nota1 = nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public void setNota2(double nota2) {
    if (nota2 < 0 || nota2 > 10) {
      System.out.println("Nota inválida");
      return;
    }
    this.nota2 = nota2;
  }

  void resultado() {
    double media = (nota1 + nota2) / 2;

    if (media < 4) {
      System.out.println("Reprovado");
    } else if (media < 7) {
      System.out.println("Exame final");
    } else {
      System.out.println("Aprovado");
    }
  }
}
