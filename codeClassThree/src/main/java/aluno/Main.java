package aluno;

public class Main {
  public static void main(String[] args) {
    var a1 = new Aluno("João", 123, 0.1, new Curso("Java", 1000));

    a1.info();
  }
}
