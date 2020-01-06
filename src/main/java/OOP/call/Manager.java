package OOP.call;

public class Manager extends Employee {
    @Override
    public Level getLevel() {
        return Level.MANAGER;
    }

    @Override
    public Level handleCall(Call call) {
        return null;
    }
}
