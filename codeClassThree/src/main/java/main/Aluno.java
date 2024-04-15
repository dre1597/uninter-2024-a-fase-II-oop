package main;

public class Aluno {
  public String nome;
  public String cpf;
  protected int notas[];
  private int matricula;


  public Aluno() {
    System.out.println("Construtor Aluno");
  }

  public Aluno(int matricula) {
    this.matricula = matricula;
    this.nome = "Vazio";
    this.cpf = "000.000.000-00";
  }

  public Aluno(int matricula, String nome, String cpf) {
    this.matricula = matricula;
    this.nome = nome;
    this.cpf = cpf;
  }

  void info() {
    System.out.println("Matricula: " + matricula);
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
  }
}
