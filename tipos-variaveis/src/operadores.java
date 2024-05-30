//import java.util.Date;

public class operadores {
    public static void main(String[] args) {

        // String nome = "WLANYSE";
        // Int idade = 49;
        // double peso = 64.4;
        // char sexo = 'F';
        // boolean doadorOrgao = false;
        // Date dataNascimento = new Date();
        // ***********************************
        // operador aritmetico
        // double soma = 10.5 + 25.7;
        // int subtração = 113 - 25;
        // int multiplicacao = 20 * 7;
        // int divisao = 15 / 3;
        // int modulo = 18 % 3;
        // double resultado = (10 * 7) + (20/4);
        // **************************************
        // EXEMPLO CONCATENAR//
        // String nomeCompleto = "LINGUAGEM" + "JAVA";

        // String concatenacao = "?";

        // concatenacao = 1 + 1 + 1 + "1";

        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + 1;

        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + "1";

        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;

        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);

        // System.out.println(concatenacao);

        // exemplo incremento
        // int numero = 5;
        // x repeticao
        // numero++; ou
        // numero--; decremento

        // System.out.println(numero);

        // operador unario
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        // boolean
        boolean variavel = true;

        variavel = !variavel; // forma de inverter variavel booleana

        System.out.println(variavel);

        // operador ternario
        int a, b;

        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";

        // ou
        // String resultado = "";
        // if (a == b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";

        System.out.println(resultado);

        // operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        // operador logico
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {

            System.out.println("as duas consições são verdadeiras");
        }
        if (condicao1 || condicao2) {

            System.out.println("uma das consições é verdadeira");
        }
        System.out.println("fim");

    }
}
