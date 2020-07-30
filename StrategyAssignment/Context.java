package DesignPattrens.StrategyAssignment;

public class Context {
    private Operation op;

    public Context(Operation op){
        this.op = op;
    }

    public double executeStrategy(double num1, double num2){
        return op.operation(num1, num2);
    }
}