 import java.util.Scanner;

class exer02Scan {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);


        int n1, n2;
        double expo1, expo2;
        String numero1, numero2;

        System.out.println("Digite o primeiro numero");
        int n1= ler.nextInt();
        System.out.println("Digite o segundo numero");
        int n2= ler.nextInt();

        /*2.1*/

        double expo1 = Math.pow(n1, 5);
        double expo2 = Math.pow(n2, 5);

        /*2.2*/

        int div = n1/n2;

        /*2.3*/
        
        int mod = n1%n2;

        /*2.4*/

        Double raiz1= Math.sqrt(n1);
        Double raiz2 = Math.sqrt(n2);

        System.out.print("n\1 Exponete do numero 1" + expo1 + "n\2 Exponente do numero 2" + expo2 + "n\3 Divisão dos numeros"+ div + "n\4 Raiz do numero 1" + raiz1 + "n\5 Raiz numero 2" + raiz2);

    }
    }
