import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        boolean loop = true;
        while (loop) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            if (aluno.setNome(nome))
            {
                break;
            }
            else
            {
                System.out.println("Nome inválido. Tente novamente.");
            }
        }

        while (loop) {
            System.out.print("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
            if (aluno.setIdade(idade))
            {
                break;
            }
            else
            {
                System.out.println("Idade inválida. Tente novamente.");
            }
        }

        scanner.nextLine(); // Limpa o buffer

        while (loop) {
            System.out.print("Digite o CPF do aluno: ");
            String cpf = scanner.nextLine();
            if (aluno.setCpf(cpf))
            {
                break;
            }
            else
            {
                System.out.println("CPF inválido. Tente novamente.");
            }
        }

        while (loop) {
            System.out.print("Digite a nota final do aluno: ");
            double notaFinal = scanner.nextDouble();

            if (aluno.setNotaFinal(notaFinal))
            {
                String estadoAluno = aluno.getEstado();
                System.out.println("\nDetalhes do aluno:");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Nota Final: " + aluno.getNotaFinal());
                System.out.println("Estado do aluno: " + estadoAluno);
                break;
            }
            else
            {
                System.out.println("Nota final inválida. Tente novamente.");
            }
        }
    }
}
