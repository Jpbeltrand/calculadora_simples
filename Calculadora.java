public class Calculadora {

    private double somarRecursivo(double a, double b) {
        if (a < b) {
            return b + a;
        }
        return a + b;
    }

    public double somar(double a, double b) {
        return somarRecursivo(a, b);
    }

    private double subtrairRecursivo(double a, double b) {
        if (a < b) {
            return b - a;
        }
        return a - b;
    }

    public double subtrair(double a, double b) {
        return subtrairRecursivo(a, b);
    }

    private double dividirRecursivo(double a, double b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            System.out.println("Não existe divisão por zero!");
        }
        return a / b;
    }

    public double dividir(double a, double b) {
        return dividirRecursivo(a, b);
    }

    private double multiplicarRecursivo(double a, double b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return multiplicarRecursivo(a, b);
    }
}
