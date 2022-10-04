import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valor = sc.nextDouble();

        System.out.println("Quantas horas você trabalha no mês?");
        double horas = sc.nextDouble();

        sc.close();

        double salario = valor*horas;

        System.out.println("O seu salário no mês é de: "+salario);
    }
}