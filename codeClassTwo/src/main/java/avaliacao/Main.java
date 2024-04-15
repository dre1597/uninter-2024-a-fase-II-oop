package avaliacao;

public class Main {
  public static void main(String[] args) {
    var a1 = new Aluno("Joaquim", "Informática", new Avaliacao(7, 4, 10));
    var a2 = new Aluno("Maria", "Informática", new Avaliacao(8, 3, 7.5));

    a1.info();
    a2.info();
  }
}
