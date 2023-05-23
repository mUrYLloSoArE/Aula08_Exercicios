import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso,altura,imc;

        System.out.println("Digite o seu peso ");
        peso = sc.nextDouble();

        System.out.println("Digite a sua altura");
        altura = sc.nextDouble();

        System.out.println("Seu peso: " + peso);

        System.out.println("Sua Altura: " + altura);

        imc = peso/(altura*altura);
        System.out.println("Seu IMC é : " + Math.round(imc) );

        sc.close();
    }
}
