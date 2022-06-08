import javax.swing.JOptionPane;

public class exer22JO {

    public static void main(String[] args) {
        int n1, n2;
        double expo1, expo2, raiz1, raiz2;
        String numero1, numero2;

        numero1 = JOptionPane.showInputDialog(null, "insira o primeiro numero");
        numero2 = JOptionPane.showInputDialog(null, "insira o segundo numero");

        n1 = Integer.parseInt(numero1);
        n2 = Integer.parseInt(numero2);
        
        /*2.1 */

        double expo1 = Math.pow(n1, 5);
        double expo2 = Math.pow(n2, 5);

        /*2.2 */

        int div = n1/n2;

        /*2.3*/

        int mod = n1%n2;

        /*2.4*/

        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);

        JOptionPane.showMessageDialog("RESULTADOS" + "Expoente do numero 1"+ expo1 + "Expoente do numero 2"+expo2+ "Resultado da Divisão" + div + "Resultado do modulo"+mod+ " Raiz do numero 1"+ raiz1+ "Raiz do segundo numero"+raiz2);





         
        
        

    }
    
}