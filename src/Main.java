import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Verificar se pode solicitar empréstimo");
            System.out.println("2 - Calcular prazo de devolução");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("O usuário está ativo? (1 - sim, 0 - não)");
                    int ativo = scanner.nextInt();
                    System.out.println("Quantos empréstimos em andamento ele tem?");
                    int emprestimos = scanner.nextInt();
                    System.out.println("Tem empréstimo atrasado? (1 - sim, 0 - não)");
                    int atrasado = scanner.nextInt();

                    if (ativo == 0) {
                        System.out.println("Não pode solicitar: o cadastro está inativo.");
                    } else if (emprestimos >= 2) {
                        System.out.println("Não pode solicitar: já tem dois empréstimos em andamento.");
                    } else if (atrasado == 1) {
                        System.out.println("Não pode solicitar: tem empréstimo em atraso.");
                    } else {
                        System.out.println("Pode solicitar o empréstimo.");
                    }
                }
                case 2 -> {
                    System.out.println("Dia da retirada:");
                    int dia = scanner.nextInt();
                    System.out.println("Mês da retirada (1 a 12):");
                    int mes = scanner.nextInt();

                    int diasNoMes = 31;
                    if (mes == 2) {
                        diasNoMes = 28;
                    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        diasNoMes = 30;
                    }

                    int diaDevolucao = dia + 7;
                    int mesDevolucao = mes;

                    if (diaDevolucao > diasNoMes) {
                        diaDevolucao = diaDevolucao - diasNoMes;
                        mesDevolucao = mesDevolucao + 1;
                    }
                    if (mesDevolucao > 12) {
                        mesDevolucao = 1;
                    }

                    System.out.println("Devolução até: " + diaDevolucao + "/" + mesDevolucao);
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        }

    }
}
