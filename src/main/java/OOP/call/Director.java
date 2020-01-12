package OOP.call;

public class Director extends Employee {
    @Override
    public Level getLevel() {
        return Level.DIRECTOR;
    }

    @Override
    public Call handleCall(Call call) {
        return null;
    }
}
