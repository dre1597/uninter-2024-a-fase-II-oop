package aulateorica;

public abstract class Funcionario {

  String nome;

  Funcionario(String nome) {
    super();
    this.nome = nome;
  }

  public abstract float pagamento();

}
