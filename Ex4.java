import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade ");
        int idade= sc.nextInt();

        System.out.println("Digite os meses ");
        int meses= sc.nextInt();

        System.out.println("Digite os dias ");
        int dias= sc.nextInt();

        int idade_meses=meses*30;
        int total_dias = (idade*365) + idade_meses + dias;

          System.out.println(" A sua idade em anos -> " + idade);
          System.out.println(" A sua idade em meses -> " + meses);
          System.out.println(" A sua idade em dias -> " + dias);

        System.out.println(" Você tem " + idade +
                           " anos " + meses + " meses " + " e " +
                           dias + " dias  = " +
                          "O seu total de dias nessa terra é -> " +  total_dias +
                          "dias "
        );

        sc.close();
    }
}
