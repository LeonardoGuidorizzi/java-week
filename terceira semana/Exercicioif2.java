
import java.util.Scanner;

public class Exercicioif2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("\n informe a sua idade\n");
        int idade = ler.nextInt();

        if (idade > 17){
            System.out.print("\nAcesso liberado, maior de idade\n");

        }else {
            System.out.print("\nAcesso negado, menor de idade\n");
            

        }

    }
    
}