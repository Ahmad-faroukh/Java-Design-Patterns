package DesignPattrens.StrategyAssignment;

public class Multiply implements Operation {
    @Override
    public double operation(double number1, double number2) {
        return number1*number2;
    }
}
