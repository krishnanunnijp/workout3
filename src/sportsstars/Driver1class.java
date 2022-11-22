package sportsstars;

import sports.Cricket;
import  sports.Football;

public class Driver1class {
    public static void main(String[] args) {
        Cricketer cricketer = new Cricketer();
        cricketer.setCricket(new Cricket(170,8));
        cricketer.setMatchesPlayed(5);
        System.out.println(cricketer.getIncome());
        Footballer footballer= new Footballer();
        footballer.setFootball(new Football(100,15));
        footballer.setMatchesPlayed(4);
        System.out.println(footballer.getIncome());
    }
}