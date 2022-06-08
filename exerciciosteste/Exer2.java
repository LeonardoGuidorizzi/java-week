package exerciciosteste;

import java.util.Scanner; 

public class Exer2 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        String nome= "Leonardo";
        String senha= "leo3607";
        int tentativas = 0;
        
        while(true){
            System.out.println("Digite o seu nome\n");
            String usuario= ler.next();
            System.out.println("Digite a senha:\n");
            String num= ler.next();

            if(usuario.equals("Leonardo") && num.equals("leo3607")){
                System.out.println("ta certinho, bem-vindo");
                break;
            }else{
                System.out.println("ta errado, tente novamente");
                tentativas++;
                System.out.println("restam " + (3-tentativas) + " tentativas");

                if(tentativas > 2){
                    System.out.println("\n ***Senha Bloqueada***");
                    break;
                    }
                }
            }    
        }
    }
    
