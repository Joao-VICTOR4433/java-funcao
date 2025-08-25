public class funcaosegundo {
    public static void main(String[]args){
        double a=8.0;
        double b=8.0;
        double resultado=soma(a,b);
        System.out.printf("A soma é %.1f",resultado);
        double resultadoraiz=raiz(a,b);
        System.out.printf("\nA soma é %.1f",resultadoraiz);
    }
    public static double soma(double a,double b) {
        return a + b;
    }
    public static double raiz(double a,double b){
        double sominha=a+b;
        double raizes= Math.sqrt(sominha);
        return raizes;

    }
}
