package DesignPattrens.StrategyAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 , num2;
        String op ;
        System.out.println("Choose Operation");
        System.out.println("+) Add");
        System.out.println("-) Subtract");
        System.out.println("*) Multiply");
        op = scanner.nextLine();

        System.out.println("");
        System.out.print("Enter Number 1 : ");
        num1 = scanner.nextDouble();
        System.out.print("Enter Number 2 : ");
        num2 = scanner.nextDouble();

        switch (op){
            case "+" :
                Context add = new Context(new Add());
                System.out.println("Result : "+add.executeStrategy(num1,num2));
            break;
            case "-" :
                Context sub = new Context(new Subtract());
                System.out.println("Result : "+sub.executeStrategy(num1,num2));
            break;
            case "*" :
                Context multi = new Context(new Multiply());
                System.out.println("Result : "+multi.executeStrategy(num1,num2));
            break;
        }

    }
}