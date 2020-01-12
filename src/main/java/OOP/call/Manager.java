package OOP.call;

public class Manager extends Employee {
    @Override
    public Level getLevel() {
        return Level.MANAGER;
    }

    @Override
    public Call handleCall(Call call) {
        return null;
    }
}
