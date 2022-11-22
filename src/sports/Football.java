package sports;

public  class Football extends outdoorGame{

    public double getSaves() {
        return saves;
    }

    public Football(int goal, int saves) {
        this.goal = goal;
        this.saves = saves;
    }

    private int goal;
    private int saves;

    public int getPoints() {
        return goal;
    }

    public void setPoints(int goal) {
        this.goal = goal;
    }

    public void setPointsSaved(int saves) {
        this.saves = saves;
    }
    public int getPointsSaved() {
        return saves;
    }

}
