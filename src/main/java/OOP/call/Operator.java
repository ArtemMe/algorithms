package OOP.call;

public class Operator extends Employee {
    @Override
    public Level getLevel() {
        return Level.OPERAATOR;
    }

    @Override
    public Call handleCall(Call call) {
        return null;
    }
}
