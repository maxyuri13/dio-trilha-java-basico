# Desafio Banco Digital - DIO

## Contexto

Com base no conhecimento adquirido no módulo de POO, desenvolvi uma solução orientada a objetos em Java. Interpretei o seguinte cenário: 'Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem funcionalidades como depósito, saque e transferência (entre contas da mesma instituição).'

# Conhecimento Utilizado

## Abstração

Abstração envolve focar nos aspectos essenciais de um domínio enquanto ignoramos características menos importantes ou acidentais. Neste contexto, objetos são abstrações de entidades existentes no domínio em questão.

## Encapsulamento

Encapsulamento significa esconder os detalhes de implementação dos objetos, criando interfaces mais concisas e fáceis de usar/entender. Encapsulamento beneficia principalmente a manutenção e evolução do sistema.

## Herança

Herança permite definir uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

## Polimorfismo

Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas. Isso permite que objetos criados a partir de classes específicas sejam tratados como objetos de uma classe genérica. No entanto, polimorfismo não significa que o objeto se transforma; ele nasce de um tipo e morre daquele tipo. O que pode mudar é a maneira como nos referimos a ele.

## Trechos de Código

Aqui estão as classes implementadas para o projeto de banco digital:

- **Main.java**: A classe `Main` é utilizada para demonstrar o uso das classes implementadas no projeto.
- **Cliente.java**: Representa informações do cliente.
- **Conta.java**: Representa uma conta bancária genérica com métodos de depósito e saque.
- **ContaCorrente.java**: Estende `Conta` e adiciona um recurso específico de limite de cheque especial.
- **ContaPoupanca.java**: Estende `Conta` e inclui um recurso de taxa de rendimento.
- **Banco.java**: Representa um banco que pode ter várias contas.

## Instruções

- Clone ou baixe o repositório.
- Configure seu ambiente de desenvolvimento com Java e seu IDE preferido.
- Compile e execute o projeto para ver as funcionalidades do banco digital em ação.

## Considerações Finais

Este projeto oferece uma excelente oportunidade para praticar conceitos de Programação Orientada a Objetos, incluindo encapsulamento, herança, abstração e polimorfismo, no contexto de construção de um banco digital em Java.

Para mais detalhes sobre o projeto, visite [DIO - Trilha Java Básico - POO](https://github.com/falvojr/lab-banco-digital-oo).