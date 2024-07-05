# Desafio Controle de Fluxo - DIO

Este projeto é uma resolução do desafio proposto pela Digital Innovation One (DIO) no módulo de dominando a linguagem de prrogamação Java, onde desenvolvi uma aplicação Java para simular a contagem e impressão de números baseados em dois parâmetros fornecidos pelo usuário via terminal.

## Descrição do Desafio

O objetivo do desafio era criar um programa Java chamado **Contador** que recebesse dois parâmetros via terminal, representando dois números inteiros. Com esses números, o programa deveria calcular a quantidade de interações e realizar a impressão no console dos números incrementados. Se o primeiro parâmetro fosse maior que o segundo, uma exceção customizada deveria ser lançada.

## Regras de Contagem

- Se o primeiro parâmetro for maior que o segundo, lançar a exceção **ParametrosInvalidosException** com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".
- Caso contrário, imprimir os números incrementados do primeiro ao segundo parâmetro.

## Instruções

1. Crie o projeto `DesafioControleFluxo`.
2. Dentro do projeto, crie a classe `Contador.java`.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException.java` para representar a exceção de negócio no sistema.
4. Compile e execute a classe `Contador.java`.
5. Siga as instruções no terminal para inserir os dados solicitados: primeiro parâmetro e segundo parâmetro.
6. O programa exibirá a sequência de números incrementados ou lançará a exceção conforme as regras de contagem.

## Exemplo de Uso

Se você passar os números 12 e 30, o programa realizará uma interação (for) com 18 ocorrências para imprimir os números, por exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

## Considerações Finais

Este projeto foi uma excelente oportunidade para praticar conceitos como entrada de dados pelo terminal, manipulação de exceções customizadas e controle de fluxo em Java.

Para mais detalhes sobre o desafio, visite [DIO - Trilha Java Básico - Controle de Fluxo](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo).
