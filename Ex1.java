import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso_adequado=50.0;
        double taxa=4.00;

        System.out.println("Coloque o peso do seu peixe");
        double peso=sc.nextDouble();

        System.out.println("Peso do seu peixe " + peso + "Kg ");

        double peso_excedido=peso-peso_adequado;
        System.out.println("Peso em excesso do peixe: " + peso_excedido + "Kg ");

        double multa =peso_excedido*taxa;
        System.out.println("Valor da multa a pagar " + "R$ " + multa);


        sc.close();
    }
}
