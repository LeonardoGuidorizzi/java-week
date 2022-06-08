

import.java.util.Scanner;

public class Exercicioif7 { 
    public static void main(String[] args) {
        Scanner.input  = new Scanner(System.in);
        System.out.print("\nInforme a medida em metros")
        double metro = input.nextDouble();

        double km= metro / 1000;
        double hm = metro / 100;
        double dam = metro / 10;
        double dm = metro / 0.1;
        double cm = metro / 0.01;
        double mm = metro / 0.001;

         System.out.print(metro + "\nM ==> "+ km "km");
         System.out.print(metro + "\nM ==> "+ hm "hm");
         System.out.print(metro + "\nM ==> "+ dam "dam");
         System.out.print(metro + "\nM ==> "+ dm "dm");
         System.out.print(metro + "\nM ==> "+ cm "cm");
         System.out.print(metro + "\nM ==> "+ mm "mm");



    }
    
}