package OOP.call;

public class Call {
    private Level rank; // минимальный ранг работника который может обработать звонок
    private boolean solved;

    public Level getRank() {
        return rank;
    }

    public void setRank(Level rank) {
        this.rank = rank;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
