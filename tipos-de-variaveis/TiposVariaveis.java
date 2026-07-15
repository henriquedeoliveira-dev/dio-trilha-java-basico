public class TiposVariaveis {
    public static void main(String[] args) {
        //TIPOS PRIMITIVOS:

        //byte idade = 127; //valor máximo para byte
        short score = 32767; //valor máximo para short
        int quantidadeEstoque = 2147483647; //valor máximo para int
        long pib = 9223372036854775807L; //valor máximo para long

        double preco = 14.123456789123456789;
        float salario = 1600.123456789123456789f; //precisa do "F" ou "f" no final!

        System.out.println(preco); // saída: 14.123456789123457
        System.out.println(salario); //saída: 1600.1234

        char letra = 'A'; //aspas simples

        boolean maiorDeIdade; //variavel que pode ser atribuído 2 estados: true or false
        int idade = 20;
        if (idade >= 18) {
            maiorDeIdade = true;
        } else {
            maiorDeIdade = false;
        }

        if (maiorDeIdade) {
            System.out.println("entrada permitida");
        } else {
            System.out.println("entrada não permitida");
        }
    }
}