void main() {
//    1 - Crie uma expressão lambda que multiplique dois números inteiros. A expressão deve ser implementada
//    dentro de uma interface funcional com o método multiplicacao(int a, int b).
    Transfomar calculo = new Transfomar();
    calculo.multipo();

//      2 - Implemente uma expressão lambda que verifique se um número é primo.
    calculo.verificarPrimo();
    Transfomar convertePalavra = new Transfomar();

//    3 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.
    convertePalavra.converteMaiuculo();


//      4 - Crie uma expressão lambda que verifique se uma string é um palíndromo.
//      A expressão deve ser implementada dentro de uma interface funcional com o método boolean verificarPalindromo(String str).
//       Dica: utilize o método reverse da classe StringBuilder.

    convertePalavra.convertePalindromo();
//    5 - Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista
//    onde cada número foi multiplicadopor 3. Dica: a função replaceAll, das Collections, recebe uma interface funcional como parâmetro,
//    assim como vimos na função forEach.

    Transfomar triplicaLista = new Transfomar();
    triplicaLista.retornaTriplo();

//    6 - Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

    Transfomar ordenaLista = new Transfomar();
    ordenaLista.ordemAlfabetica();

//    7 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.
    Transfomar divisao= new Transfomar();
    divisao.divide();


}
