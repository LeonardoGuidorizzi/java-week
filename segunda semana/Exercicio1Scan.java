import java.util.Scanner;

public class Exercicio1Scan {
 public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     


     System.out.println("digite o primeiro valor :");
     double n1= ler.nextDouble();
     System.out.println("digite o segundo valor");
     double n2= ler.nextDouble();
     
     double Ad= n1+n2;
     double Sub= n1-n2;
     double Mult= n1*n2;
     double Div= n1/n2;
     
     System.out.println("Resultado=\n1 Adição "+Ad+ "\n2 Subtração"+Sub+"\n3 Multiplicação"+Mult+"\n4 Divisão"+Div);

 }
    
}