package exerciciosteste;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = 0;
        int expoente = 0;

        while (true){
            System.out.print("\nDigite o valor da base >= 0:\n");
            base = input.nextInt();
            System.out.print("\nDigite o valor da expoente >=0\n");
            expoente = input.nextInt();
            if (base >= 0 && expoente >= 0){
                break;

            }
        }
        long pot = base;

        if(expoente == 0){
            System.out.println(base+"^"+expoente+"= 1");
        }

        for(int i=1;i<expoente;i++);{
            pot *= base;
    }
    System.out.println(base+"^"+expoente+"="+pot);
    
    }
}
