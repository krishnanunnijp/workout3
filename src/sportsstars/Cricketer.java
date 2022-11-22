package sportsstars;

import sports.Cricket;
import sports.outdoorGame;

public class Cricketer {
    private outdoorGame cricket;
    private double rating;
    private int matchesPlayed;
    private double income;

    public double getIncome() {
        return income;
    }

    public Cricketer() {
    }

    public void setCricket(outdoorGame cricket) {
        this.cricket = cricket;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
        setRating();
        calculate_income();
    }

    private void setRating() {
        int runs = this.cricket.getPoints();
        int wicket = this.cricket.getPointsSaved();
        double battingAverage = runs / this.matchesPlayed;
        double bowlingAverage = wicket / this.matchesPlayed;
        if (battingAverage > 50) {
                        if (bowlingAverage>3) {
                            this.rating=5;
                        }else {
                            this.rating=4;
                        }
        }else {
                if (bowlingAverage>3) {
                        this.rating=4;
                }else {
                        this.rating=3;
                }
        }


    }

    private void calculate_income() {
        this.income = this.rating * 120000;

    }
}
