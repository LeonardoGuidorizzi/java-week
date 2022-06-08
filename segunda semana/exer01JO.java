
import javax.swing.JOptionPane;

public class exer01JO {
    public static void main(String[] args) {
        double Ad, Sub, Mult, Div, n1, n2;
        String numero1, numero2;

        numero1 = JOptionPane.showInputDialog(null, "insira o primeiro numero ");
        numero2 = JOptionPane.showInputDialog(null, "insira o segundo numero");

        n1 = Double.parseDouble(numero1);
        n2 = Double.parseDouble(numero2);

        Ad = n1 + n2;
        Sub = n1 - n2;
        Mult = n1 * n2;
        Div = n1 / n2;

        JOptionPane.showMessageDialog(null, "RESULTADO :" + "\n1- Adição:" +Ad+ "\n2 - subtraçao:" +Sub+ "\n3 - Multiplicaçao" +Mult+ "\n4 - Divisao:" +Div);
        System.exit(0);
    }

    
}