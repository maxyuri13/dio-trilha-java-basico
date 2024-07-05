# Flow Control Challenge - DIO

This project is a solution to the challenge proposed by Digital Innovation One (DIO) in the module of mastering the Java programming language, where I developed a Java application to simulate the counting and printing of numbers based on two parameters provided by the user via terminal.

## Challenge Description

The goal of the challenge was to create a Java program called **Counter** that received two parameters via terminal, representing two integers. With these numbers, the program should calculate the number of interactions and print the incremented numbers in the console. If the first parameter was greater than the second, a custom exception should be thrown.

## Counting Rules

- If the first parameter is greater than the second, throw the **InvalidParametersException** with the message: "The second parameter must be greater than the first".
- Otherwise, print the incremented numbers from the first to the second parameter.

## Instructions

1. Create the `FluxControl` project.
2. Inside the project, create the `Counter.java` class.
3. Inside the project, create the `InvalidParametersException.java` class to represent the business exception in the system.
4. Compile and run the `Counter.java` class.
5. Follow the instructions in the terminal to enter the requested data: first parameter and second parameter.
6. The program will display the sequence of incremented numbers or throw the exception according to the counting rules.

## Example of Use

If you pass the numbers 12 and 30, the program will perform a loop (for) with 18 occurrences to print the numbers, for example: "Printing number 1", "Printing number 2", and so on.

## Final Considerations

This project was an excellent opportunity to practice concepts such as terminal input, custom exception handling, and flow control in Java.

For more details about the challenge, visit [DIO - Java Basics Track - Flow Control](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo).
