package aulateorica;

public class Principal {

  public static void main(String[] args) {

    Funcionario f3 = new Assalariado("Mario", 3500);

    f3 = new Horista("Luigi", 100, 40.5f);

    Funcionario funcionarios[] = {new Assalariado("Mario", 3500),
        new Horista("Luigi", 100, 40.5f),
        new Comissionado("Yoshi", 50000, 0.05f)};
    Funcionario f;
    float total = 0;

    for (Funcionario funcionario : funcionarios) {
      f = funcionario;
      System.out.println(f.nome + " salario: " + f.pagamento());
      total += f.pagamento();
    }

    System.out.println("Total: " + total);
    Funcionario f4 = new Assalariado("Mario", 1000);


    Gato g1 = new Gato();
    Animal a1 = new Gato();

    a1.emitirSom();
    g1.emitirSom();
    a1.dormir();
    g1.dormir();


    Roupa r1 = new Roupa("Camisa", 3, Estacao.OUTONO);
    r1.msg();
  }
}
