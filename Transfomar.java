import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Transfomar {
    Scanner ler = new Scanner(System.in);
    Operacao multiplicar = (valor1, valor2) -> valor1 * valor2;

    public void multipo() {
        System.out.println("Digite o primeiro valor: ");
        int valor1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = ler.nextInt();

        System.out.println("Resultado da multiplicação é: " + multiplicar.operacao(valor1, valor2));
    }


    //    // Implementando o método que verifica se é primo
    VerificadorPrimo verificaPrimo = numero -> {

        if (numero <= 1) return false;


        // Lógica matemática para verificar números primos
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    };

    public void verificarPrimo() {
        System.out.println("Digite o um valor: ");
        int valor = ler.nextInt();
        System.out.printf("O numero %d é primo?%b%n ", valor, verificaPrimo.primo(valor));

    }

    Interface<String> paraMaiuculo = (palavra) -> palavra.toUpperCase();

    public void converteMaiuculo() {
        System.out.println("Digite a palavra em minusculo: ");
        String palavra = ler.next();
        System.out.printf("A palavra em maiuculo %S%n", paraMaiuculo.converte(palavra));
    }

    /**
     * PREDICATE: Interface funcional que recebe um valor (T) e SEMPRE retorna um boolean.
     * Ideal para filtros, validações e testes de verdadeiro/falso.
     */
    Predicate<String> verificarPalindromo = (palavraOriginal) -> {
        String palavraInvertida = new StringBuilder(palavraOriginal).reverse().toString();
        return palavraOriginal.equals(palavraInvertida);
    };

    public void convertePalindromo() {
        System.out.println("Digite a palavra para saber ser é um Palindromo: ");
        String palavra = ler.next();
        System.out.printf("A palavra %S é um Palindromo? %b%n", palavra, verificarPalindromo.test(palavra));
    }

    List<Integer> recebeNumero = new ArrayList<>();
    public void retornaTriplo(){
        System.out.println("Digite tamanho da lista: ");
        int tamanho = ler.nextInt();
        for(int i = 0; i < tamanho; i++){
            System.out.printf("Digite o numero %dº da lista %n", (i+1));
            recebeNumero.add(ler.nextInt());
        }
        System.out.println("---- Antes-----");
        recebeNumero.forEach(System.out::println);
        recebeNumero.replaceAll(v -> v * 3);
        System.out.println("---- Depois-----");
        recebeNumero.forEach(System.out::println);
    }

    List<String> palavra = new ArrayList<>();
    public void ordemAlfabetica(){
        System.out.println("Digite a quantidade de palavras: ");
        int quantidadePalavra = ler.nextInt();
        for(int i = 0; i < quantidadePalavra; i++){
            System.out.println("Digite a palavra: ");
            palavra.add(ler.next());
        }
        System.out.println("---- Fora De Ordem-----");
        palavra.forEach(p -> System.out.printf("Palavra: %s%n", p));

        palavra.sort(null);
        System.out.println("---- Em Ordem-----");
        palavra.forEach(p -> System.out.printf("Palavra: %s%n",p ));

    }
    // 1. Criamos a função usando a interface do Java (Entra int, Entra int, Sai Double)
    BiFunction<Integer, Integer, Double> divide = (valor1, valor2) -> {
        // Se o divisor for zero, NÓS lançamos o erro na marra!
        if (valor2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }

        // Se passar pelo if (não for zero), faz a conta normal
        return (double) valor1 / valor2;
    };
    public void divide(){
        System.out.println("Digite o primeiro valor: ");
        int valor1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = ler.nextInt();
        try {
            // 2. Usamos %.2f para formatar e chamamos divide.apply() ao invés de divide.operacao()
            System.out.printf("A divisão do valor %d por valor %d é %.2f%n", valor1, valor2, divide.apply(valor1, valor2));
        }
        catch (ArithmeticException e){
            System.out.println("Erro: O divisor deu zero. Não é possível dividir!");
        }

    }
}
