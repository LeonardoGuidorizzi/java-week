import java.util.Scanner;

 public class Exercicioif1{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n informe um numero ae");
        int numero = ler.nextInt();
        if (numero == 0){
                System.out.println("\n numero e zero");
        }
        else{
            if(numero < 0){
                System.out.println("\n E negativo");

            }else{
                System.out.println("\n E positivo");
            }
        }
        
       

       }

    }