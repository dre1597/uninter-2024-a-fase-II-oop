package student;

public class Main {
  public static void main(String[] args) {
    var avaliacao1 = new Avaliacao(7, 4, 10);
    System.out.println("Média Aritmetica: " + avaliacao1.mediaAritmetica());
    System.out.println("Média Ponderada: " + avaliacao1.mediaPonderada());

    var avaliacao2 = new Avaliacao();

    avaliacao2.n1 = 8;
    avaliacao2.n2 = 3;
    avaliacao2.n3 = 7.5;

    System.out.println("Média Aritmetica: " + avaliacao2.mediaAritmetica());
    System.out.println("Média Ponderada: " + avaliacao2.mediaPonderada());
  }
}
