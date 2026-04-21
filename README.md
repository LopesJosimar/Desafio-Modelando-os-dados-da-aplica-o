# 💻 Desafio: Modelando os Dados da Aplicação

Este repositório contém a minha resolução para o desafio "Modelando os Dados da Aplicação" da Alura. O projeto foi desenvolvido para consolidar conceitos avançados de Programação Orientada a Objetos (POO) e explorar o paradigma funcional utilizando recursos modernos da linguagem Java.

## 🎯 Objetivo do Projeto
Resolver 7 desafios lógicos e matemáticos (como verificação de números primos, palíndromos e formatação de strings) aplicando boas práticas de programação. O grande diferencial desta implementação é a substituição de métodos tradicionais por **Expressões Lambda**, reduzindo a verbosidade e tornando o código mais conciso e elegante.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (POO) com forte foco em Programação Funcional
* **Recursos Avançados:** * Criação de Interfaces Funcionais customizadas e genéricas (`<T>`).
    * Utilização do pacote `java.util.function` (`Predicate`, `BiFunction`).
    * Manipulação de coleções via lambdas (`replaceAll`, `sort`).
    * Tratamento de exceções em escopo funcional (`ArithmeticException`).

## 📁 Estrutura do Código
As operações lógicas estão centralizadas e modularizadas nas seguintes estruturas:
* `Main.java`: Ponto de entrada que executa e testa os 7 desafios propostos.
* `Transfomar.java`: Classe principal que implementa toda a lógica funcional, utilizando a classe `Scanner` para interagir dinamicamente com o usuário.
* `Interface.java` / `Operacao.java` / `VerificadorPrimo.java`: Interfaces funcionais desenhadas para receber as expressões lambda.