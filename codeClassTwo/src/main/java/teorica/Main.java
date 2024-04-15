package teorica;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    var alunoA = new Aluno();

    alunoA.matricula = 1001;
    alunoA.nome = "Joaquim";
    alunoA.cpf = "111.111.111-11";
    alunoA.info();

    alunoA.nome = "Maria";
    alunoA.info();

    var alunoB = new Aluno();

    alunoB.matricula = 1002;
    alunoB.nome = "Pedro";
    alunoB.cpf = "222.222.222-22";
    alunoB.info();

    var carro = new Carro();

    System.out.println(Carro.milhasParaMetros(10));

    Turma turma = new Turma();
    turma.professor  = new Professor();
    turma.professor.nome = "Leonardo";
    turma.alunos = new ArrayList<Aluno>();
    turma.alunos.add(new Aluno());
    turma.alunos.get(0).nome="Super Mario";



    var alunoC = new Aluno(1002,"Super Luigi","222.333.444-55");
    alunoC.info();

    var alunoD = new Aluno(1003);
    alunoD.info();

    var listaAlunos = new ArrayList<Aluno>();
    listaAlunos.add(alunoD);
    listaAlunos.add(new Aluno(1005,"Bowser","555.666.777-88"));
  }
}
