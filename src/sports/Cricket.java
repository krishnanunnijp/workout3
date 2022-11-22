package sports;

public class  Cricket extends outdoorGame {
    public Cricket(int runs, int wicket) {
        this.runs = runs;
        this.wicket = wicket;
    }

    private int runs;
    private int wicket;

    public int getPoints() {
        return runs;
    }

    public int getPointsSaved() {
        return wicket;
    }

    public void setPoints(int runs) {
        this.runs = runs;
    }

    public void setPointsSaved(int wicket) {
        this.wicket = wicket;
    }
}
