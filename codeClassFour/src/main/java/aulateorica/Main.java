package aulateorica;

public class Main {
  public static void main(String[] args) {
    var l1 = new Livro("Sherlock Holmes", "Sir Arthur Conan Doyle");


    var l2 = new LivroDigital("Sherlock Holmes", "Sir Arthur Conan Doyle", "http://meusite/sherlock");

    System.out.println(l1 instanceof Livro);
    System.out.println(l2 instanceof Livro);
    System.out.println(l1 instanceof LivroDigital);
    System.out.println(l2 instanceof LivroDigital);
  }
}
