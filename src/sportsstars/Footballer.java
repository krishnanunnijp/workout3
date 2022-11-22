package sportsstars;

import sports.Football;
import sports.outdoorGame;

public class Footballer {
    private outdoorGame football;
    private double rating;

    private int matchesPlayed;
    private double income;

    public double getIncome() {
        return income;
    }

    public void setFootball(outdoorGame football) {
        this.football = football;
    }

    public outdoorGame getFootball() {
        return football;
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
        int runs = this.football.getPoints();
        int saves = this.football.getPointsSaved();
        double goalAverage = runs / this.matchesPlayed;
        double saveAverage = saves / this.matchesPlayed;
        if (goalAverage > 3) {
            if (saveAverage>5) {
                this.rating=5;
            }else {
                this.rating=4;
            }
        }else {
            if (saveAverage>5) {
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
