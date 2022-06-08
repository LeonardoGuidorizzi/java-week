package exerciciosteste;
import java.util.Scanner;
public class Exer1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while(true){
        System.out.print("Informe um numero e eu direi se he impar ou par: \n");
        int n = ler.nextInt();
        
        if(n%2==0){
            System.out.println("Este numero eh par");
        }else{
            System.out.println("Este numero he impar ");
        }
            System.out.println("deseja continuar?[s/n]");
            char op = ler.next().charAt(0);
            if(op != 's')
            System.exit(0);
        }
        
    }
}
    
