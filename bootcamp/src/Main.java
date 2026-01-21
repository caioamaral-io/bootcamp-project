import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Pessoa
        System.out.println("=== Cadastro de Pessoa ===");
        Pessoa pessoa = new Pessoa();
        System.out.print("Nome: ");
        pessoa.setNome(sc.nextLine());
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        pessoa.setDataNascimento(LocalDate.parse(sc.nextLine(), formatter));
        System.out.print("Altura (em metros): ");
        pessoa.setAltura(sc.nextDouble());
        sc.nextLine();

        System.out.println("\n--- Infos Pessoa ---");
        pessoa.imprimirInfos();


        // Jogador
        System.out.println("\n=== TASK: JOGADOR DE FUTEBOL ===");
        JogadorFutebol jogador = new JogadorFutebol();
        System.out.print("Nome: ");
        jogador.setNome(sc.nextLine());
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        jogador.setDataNascimento(LocalDate.parse(sc.nextLine(), formatter));
        System.out.print("Altura (em metros): ");
        jogador.setAltura(sc.nextDouble());
        System.out.print("Peso (em kg): ");
        jogador.setPeso(sc.nextDouble());
        sc.nextLine();
        System.out.print("Posição (Zagueiro, Meio-Campo, Atacante): ");
        jogador.setPosicao(sc.nextLine());
        System.out.print("Nacionalidade: ");
        jogador.setNacionalidade(sc.nextLine());

        System.out.println("\n--- Infos do Jogador ---");
        jogador.imprimirInfos();


        // Elevador
        System.out.println("\n=== TASK: ELEVADOR ===");
        Elevador elevador = new Elevador();
        System.out.print("Capacidade do elevador: ");
        int capacidade = sc.nextInt();
        System.out.print("Total de andares: ");
        int totalAndares = sc.nextInt();
        elevador.inicializa(capacidade, totalAndares);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nElevador no andar " + elevador.getAndarAtual() + " com " + elevador.getPessoasPresentes() + " pessoas.");
            System.out.println("Escolha uma ação: 1-Entra 2-Sai 3-Sobe 4-Desce 0-Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> elevador.entra();
                case 2 -> elevador.sai();
                case 3 -> elevador.sobe();
                case 4 -> elevador.desce();
                case 0 -> continuar = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        sc.close();
        System.out.println("Programa finalizado.");
    }
}
