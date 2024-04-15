package teorica;

public class Aluno {
  int matricula;
  String nome;
  String cpf;

  Aluno() {
    System.out.println("Construtor Aluno");
  }

  Aluno(int matricula, String nome, String cpf) {
    this.matricula = matricula;
    this.nome = nome;
    this.cpf = cpf;
  }

  Aluno(int matricula) {
    this.matricula = matricula;
    this.nome = "Vazio";
    this.cpf = "000.000.000-00";
  }

  void info() {
    System.out.println("Matricula: " + matricula);
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
  }
}
