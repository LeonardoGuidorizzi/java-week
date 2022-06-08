import.java.util.Scanner;

public class Exercicioif8 {
    public static void main(String[] args) {
        Scanner.ler = new Scanner(System.in);
        System.out.print("Adicione a sua peso");
        double altura = ler.nextDouble();
        System.out.print("Adicione altura");
        Double peso = ler.nextDoble(); 

        Double imc = peso / (altura * altura);

    }
    
}