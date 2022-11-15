public class TestaCondicional {
    public static void main(String[] args) {
        
        System.out.println("testando condicionais");

        int idade = 15;
        int quantidadePessoas = 1;


        if (idade >= 18) {
            System.out.println("Você é maior de idade");
            System.out.println("seja bem vindo!");        
        }
        else {
            
            if ( quantidadePessoas >= 2) {
                System.out.println("Você é menor de idade "
                        + "porém pode entrar por estar acompanhado");
            } else {
                System.out.println("você é menor de idade");
                System.out.println("infelizmente você não pode entrar!");
        
            }
        }
    }

}