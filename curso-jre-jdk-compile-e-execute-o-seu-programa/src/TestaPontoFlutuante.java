public class TestaPontoFlutuante {

    public static void main(String[] args) {

        double salario = 1715.30;

        System.out.println("meu salario é " + salario);

        double idade = 37; // um número inteiro cabe numa variável double, porém uma variável double não
                           // cabe numa variável double

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao); // divisao de inteiro com inteiro sempre vai dar inteiro

        System.out.println("uma idade aleatória " + idade + ", uma divisão aleatória " + divisao
                + ", outra divisao aleatória " + outraDivisao);

        double outraTentativa = 5 / 2;
        System.out.println(outraTentativa); // o java resolve primeiro o que está a direita e depois atribui a variável

        double outraTentativa2 = 5.0 / 2;
        System.out.println(outraTentativa2);
    }

}
