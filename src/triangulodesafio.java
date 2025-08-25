import java.util.Scanner;
public class triangulodesafio {
    public static void main(String[]args){
        Scanner leitor=new Scanner(System.in);
        double a,b;
        System.out.println("Digite a altura do triangulo: ");
        a=leitor.nextDouble();
        System.out.println("Digite base do triangulo: ");
        b=leitor.nextDouble();
        double resultado=areatriangulo(a,b);
        System.out.println("A area do triangulo foi"+resultado);
        //c=leitor.nextDouble();
        leitor.close();
    }
    public static double areatriangulo(double a,double b){
        double triangulo=(a*b)/2;
        return  triangulo;
    }
}
