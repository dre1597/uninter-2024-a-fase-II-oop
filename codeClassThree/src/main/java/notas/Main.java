package notas;

public class Main {
  public static void main(String[] args) {
    var nota = new Nota();

    nota.setNota1(10);
    nota.setNota2(9);
    nota.setFaltas(0);
    nota.resultado();

    nota.setNota1(10);
    nota.setNota2(9);
    nota.setFaltas(1);
    nota.resultado();
  }
}
