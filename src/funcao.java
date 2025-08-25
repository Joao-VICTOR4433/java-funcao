public class funcao {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = 4;

        // Chamada da função
        int maior = max(a, b, c);
        System.out.println("O maior valor é: " + maior);
    }

    // Método max está fora do main
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
