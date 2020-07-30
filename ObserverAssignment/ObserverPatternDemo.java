package DesignPattrens.ObserverAssignment;

import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new Hexa(subject);
        new Octal(subject);
        new BinaryObserver(subject);

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int input = 0 ;

        while (flag){
            System.out.print("Decimal : ");
            input = scanner.nextInt();
            subject.setState(input);
            System.out.println("");
        }

    }
}