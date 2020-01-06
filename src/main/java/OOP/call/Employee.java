package OOP.call;

public abstract class Employee {
    private boolean isBusy = false;

    public void takeCall() {
        this.isBusy = true;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public abstract Level getLevel();
    public abstract Call handleCall(Call call);
    public void callCompleted() {
        this.isBusy = false;
        //some code
    }
}
