import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario_min=1212.00;

        System.out.println("Digite o seu salario:");
        double salario = sc.nextDouble();

        double salarios=salario/salario_min;
        System.out.printf("Isso equivale em salário minimos -> :%.2f " ,salarios);


        sc.close();
    }
}
