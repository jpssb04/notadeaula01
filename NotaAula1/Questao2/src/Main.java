import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("Digite o código do produto:");
        p.setCodigo(sc.nextInt());
        System.out.println("Digite o nome do produto:");
        p.setNome(sc2.nextLine());
        System.out.println("Digite o comprimento do produto em centímetros:");
        p.setComprimento(sc.nextDouble());
        System.out.println("Digite a largura do produto em centímetros:");
        p.setLargura(sc.nextDouble());
        System.out.println("Digite a altura do produto em centímetros:");
        p.setAltura(sc.nextDouble());
        System.out.println("Digite o peso do produto em quilogramas:");
        p.setPeso(sc.nextDouble());
        System.out.println("Digite a cor do produto:");
        p.setCor(sc2.nextLine());
        System.out.println("Digite o valor do produto:");
        p.setValor(sc.nextDouble());
        System.out.println("Digite a quantidade em estoque do produto:");
        p.setEstoque(sc.nextInt());

        System.out.println("----====----====----====----====----");

        System.out.printf("O produto custa: R$ %.2f\n", p.getValor());
        System.out.println("Qual será a forma de pagamento?");
        System.out.println("0 - Pix (5% desconto)");
        System.out.println("1 - Espécie (5% desconto)");
        System.out.println("2 - Transferência (5% desconto)");
        System.out.println("3 - Débito (5% desconto)");
        System.out.println("4 - Crédito (3x sem juros)");
        int controle = sc.nextInt();

        switch (controle){
            case (0):
                System.out.println("Forma de pagamento escolhida: Pix (5% desconto)");
                System.out.printf("Valor Final: R$ %.2f\n", p.getValor() * 0.95);
                System.out.println("Obrigado por escolher nosso supermercado!");
                break;
            case (1):
                System.out.println("Forma de pagamento escolhida: Espécie (5% desconto)");
                System.out.printf("Valor Final: R$ %.2f\n", p.getValor() * 0.95);
                System.out.println("Digite o valor total do dinheiro em espécie:");
                double valorTotal = sc.nextDouble();
                double valorTroco = valorTotal - p.getValor() * 0.95;
                System.out.printf("Valor do troco: R$ %.2f\n", valorTroco);
                System.out.println("Obrigado por escolher nosso supermercado!");
                break;
            case (2):
                System.out.println("Forma de pagamento escolhida: Transferência (5% desconto)");
                System.out.printf("Valor Final: R$ %.2f\n", p.getValor() * 0.95);
                System.out.println("Obrigado por escolher nosso supermercado!");
                break;
            case (3):
                System.out.println("Forma de pagamento escolhida: Débito (5% desconto)");
                System.out.printf("Valor Final: R$ %.2f\n", p.getValor() * 0.95);
                System.out.println("Obrigado por escolher nosso supermercado!");
                break;
            case (4):
                System.out.println("Forma de pagamento escolhida: Crédito (3x sem juros)");
                System.out.println("Gostaria de dividir em 3 parcelas sem juros? (S | N)");
                String controle2 = sc2.nextLine();
                if (controle2.equalsIgnoreCase("S")){
                    System.out.printf("Valor Final: 3x de R$ %.2f\n", p.getValor() / 3);
                    System.out.println("Obrigado por escolher nosso supermercado!");
                }
                else {
                    System.out.printf("Valor Final: R$ %.2f\n", p.getValor());
                    System.out.println("Obrigado por escolher nosso supermercado!");
                }
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }
    }
}