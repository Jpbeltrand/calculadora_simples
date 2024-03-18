import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double resultado;
        String escolha;
        Calculadora calculadora = new Calculadora();
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite os valores: ");
            double a = in.nextDouble();
            double b = in.nextDouble();
            in.nextLine();
            System.out.println("Escolha a operação: ");
            escolha = in.nextLine().toLowerCase(); // le o primero caractere

            switch (escolha) {
                case "+":
                    resultado = calculadora.somar(a, b);
                    System.out.println("Cálculo: " + a + " + " + b);
                    System.out.println("Resultado:" + resultado);
                    break;
                case "-":
                    resultado = calculadora.subtrair(a, b);
                    System.out.println("Cálculo: " + a + " - " + b);
                    System.out.println("Resultado:" + resultado);
                    break;
                case "/":
                    resultado = calculadora.dividir(a, b);
                    System.out.println("Cálculo: " + a + " / " + b);
                    System.out.println("Resultado:" + resultado);
                    break;
                case "x":
                    resultado = calculadora.subtrair(a, b);
                    System.out.println("Cálculo: " + a + " x " + b);
                    System.out.println("Resultado:" + resultado);
                    break;
                case "sair":
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        } while (!escolha.equals("sair"));
        System.out.println("Final");
        in.close();
    }
}