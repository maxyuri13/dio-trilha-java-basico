# Digital Bank Challenge - DIO

## Context

Based on the knowledge acquired in the OOP module, I developed an object-oriented solution in Java. I interpreted the following scenario: 'A bank offers its clients two types of accounts (checking and savings), which have functionalities such as deposit, withdrawal, and transfer (between accounts of the same institution).'

# Used Knowledge

## Abstraction

Abstraction involves focusing on the essential aspects of a domain while ignoring less important or accidental characteristics. In this context, objects are abstractions of entities existing in the domain in question.

## Encapsulation

Encapsulation means hiding the implementation details of objects, creating more concise and easy-to-use/understand interfaces. Encapsulation mainly benefits system maintenance and evolution.

## Inheritance

Inheritance allows defining a child class that reuses (inherits), extends, or modifies the behavior of a parent class. The class whose members are inherited is called the base class. The class that inherits the members of the base class is called the derived class.

## Polymorphism

Polymorphism is the ability of an object to be referenced in multiple ways. This allows objects created from specific classes to be treated as objects of a generic class. However, polymorphism does not mean that the object transforms; it is born of one type and dies of that type. What can change is the way we refer to it.

## Code Snippets

Here are the classes implemented for the digital bank project:

- **Main.java**: The `Main` class is used to demonstrate the usage of the implemented classes in the project.
- **Cliente.java**: Represents client information.
- **Conta.java**: Represents a generic bank account with deposit and withdrawal methods.
- **ContaCorrente.java**: Extends `Conta` and adds a specific feature of overdraft limit.
- **ContaPoupanca.java**: Extends `Conta` and includes a feature of interest rate.
- **Banco.java**: Represents a bank that can have multiple accounts.

## Instructions

- Clone or download the repository.
- Set up your development environment with Java and your preferred IDE.
- Compile and run the project to see the functionalities of the digital bank in action.

## Final Considerations

This project offers an excellent opportunity to practice Object-Oriented Programming concepts, including encapsulation, inheritance, abstraction, and polymorphism, in the context of building a digital bank in Java.

For more details about the project, visit [DIO - Basic Java Trail - OOP](https://github.com/falvojr/lab-banco-digital-oo).
