public class TestaCondicional2 {
    public static void main(String[] args) {
        
        System.out.println("testando condicionais");

        int idade = 18;
        int quantidadePessoas = 1;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("o valor de acompanhado é " + acompanhado);


        if (idade >= 18 || quantidadePessoas >= 2) { // operador || (ou) basta que 1 das afirmações sejam verdadeiras
            System.out.println("seja bem vindo!");        
        }
        else {
            System.out.println("você é menor de idade");
            System.out.println("e sozinho, infelizmente não pode entrar!");
        
            }

        if (idade >= 18 && quantidadePessoas >= 2) { // operador && (e) as duas afirmações precisam ser verdadeiras
            System.out.println("seja bem vindo!");        
        }
        else {
            System.out.println("você está sozinho");
            System.out.println("infelizmente não pode entrar!");
        
            }

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo!");        
        }
        else {
            System.out.println("você está sozinho");
            System.out.println("infelizmente não pode entrar!");
        
            }
    }

}