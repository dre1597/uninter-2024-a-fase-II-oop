package org.example;

import java.util.Scanner;

public class Main {
  public static void exibirMenu() {
    System.out.println("\nMENU: ");
    System.out.println("1 - Adicionar Moeda");
    System.out.println("2 - Remover Moeda");
    System.out.println("3 - Listar Moedas");
    System.out.println("4 - Calcular total em real");
    System.out.println("0 - Sair");
  }

  public static void exibirMenuAdicionar() {
    System.out.println("\nMENU ADICIONAR: ");
    System.out.println("1 - Real");
    System.out.println("2 - Euro");
    System.out.println("3 - Dolar");
    System.out.println("0 - Voltar");
  }

  public static void adicionar(Scanner scanner, Cofrinho cofrinho) {
    exibirMenuAdicionar();

    System.out.print("Qual moeda deseja adicionar? ");
    var opcaoAdicionar = scanner.nextInt();

    if (opcaoAdicionar == 0) {
      return;
    }

    System.out.print("Digite o valor da moeda: ");
    var valorMoeda = scanner.nextDouble();

    switch (opcaoAdicionar) {
      case 1:
        cofrinho.adicionar(new Real(valorMoeda));
        System.out.println("Moeda adicionada com sucesso!");
        break;
      case 2:
        cofrinho.adicionar(new Euro(valorMoeda));
        System.out.println("Moeda adicionada com sucesso!");
        break;
      case 3:
        cofrinho.adicionar(new Dolar(valorMoeda));
        System.out.println("Moeda adicionada com sucesso!");
        break;
      default:
        System.out.println("Opção inválida");
        adicionar(scanner, cofrinho);
        break;
    }
  }

  public static void exibirMenuRemover() {
    System.out.println("\nMENU REMOVER: ");
    System.out.println("Entre com o índice da moeda que deseja remover ou digite 0 para voltar: ");
  }

  public static void remover(Scanner scanner, Cofrinho cofrinho) {
    exibirMenuRemover();
    cofrinho.listagemMoedas();
    System.out.print("Indice: ");
    var opcaoRemover = scanner.nextInt();

    if (opcaoRemover == 0) {
      return;
    }

    cofrinho.remover(opcaoRemover);
    System.out.println("Moeda removida com sucesso!");
  }

  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      var cofrinho = new Cofrinho();

      exibirMenu();
      System.out.print("Escolha uma opção: ");
      var opcao = scanner.nextInt();

      while (opcao != 0) {
        switch (opcao) {
          case 1:
            adicionar(scanner, cofrinho);
            break;
          case 2:
            remover(scanner, cofrinho);
            break;
          case 3:
            System.out.println("Cofrinho: ");
            cofrinho.listagemMoedas();
            break;
          case 4:
            System.out.println("Total em real: ");
            System.out.println("R$ " + cofrinho.totalConvertido());
            break;
          default:
            System.out.println("Opção inválida");
            break;
        }

        exibirMenu();
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
      }

      System.out.println("Saindo...");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
