package OOP.call;

public class Director extends Employee {
    @Override
    public Level getLevel() {
        return Level.DIRECTOR;
    }

    @Override
    public Level handleCall(Call call) {
        return null;
    }
}
