import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeAluno, resultado;
        CalculoAluno calc = new CalculoAluno();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        nomeAluno = sc2.nextLine();

        System.out.println("Digite a nota 1:");
        int n1 = sc.nextInt();

        System.out.println("Digite a nota 2:");
        int n2 = sc.nextInt();

        System.out.println("Digite a nota 3:");
        int n3 = sc.nextInt();

        resultado = calc.CalculoMedia(n1, n2, n3);
        System.out.println("O aluno " +  nomeAluno + " está " + resultado);
    }
}