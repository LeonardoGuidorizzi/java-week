class Exercicio4 {
    public static void main(String[] args) {

        double precoProduto = 250;
        double descontoPercentual = 15;

        double descontoMonetario = precoProduto * descontoPercentual /100;
        double precoFinal = precoProduto - descontoMonetario; 
        System.out.println("Valor a pagar:" + precoFinal);

    
        
    }
    
}