package exerciciosteste;

public class Exer6 {
    public static void main(String[] args) {
        String frase = "Desenvolvimento de Sistemas - Turma DS1-M";
        char ch= '\u2588';

        for(int i=0;i<81;i++){
            System.out.print(ch);
        }
        System.out.print("\n"+ch + "\t\t\t"+frase+"\t\t"+ch);
        
        System.out.println();
        for(int i=0;i<81;i++){
        System.out.print(ch);
        }
    }
    
}