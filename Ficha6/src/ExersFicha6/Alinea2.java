package ExersFicha6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
    String email;
    String telefone;

    public Pessoa(String nome, int idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("---------------------");
    }
}

public class Alinea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>(); 

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Ver todas as pessoas");
            System.out.println("3. Contar pessoas");
            System.out.println("4. Procurar por email");
            System.out.println("5. Apagar todos os contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Pessoa novaPessoa = new Pessoa(nome, idade, email, telefone);
                    lista.add(novaPessoa);
                    System.out.println("Pessoa adicionada!");
                }

                case 2 -> {
                    if (lista.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa p : lista) {
                            p.mostrarDados();
                        }
                    }
                }

                case 3 -> System.out.println("Total de pessoas: " + lista.size());

                case 4 -> {
                    System.out.print("Digite o email para buscar: ");
                    String emailBusca = scanner.nextLine();
                    boolean achou = false;
                    for (Pessoa p : lista) {
                        if (p.email.equalsIgnoreCase(emailBusca)) {
                            p.mostrarDados();
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Pessoa não encontrada.");
                    }
                }

                case 5 -> {
                    lista.clear();
                    System.out.println("Todos os contatos foram apagados.");
                }

                case 0 -> System.out.println("Saindo do programa...");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
