package chapters.chapter10.Generics.GenericsChallenge;

import chapters.chapter10.Generics.OurGenericsClass.BaseballPlayer;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaidCrows = new Team<>("AdelaidCrows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team <FootballPlayer> hawthorn = new Team<>("Hawthort");
        Team <FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Clubs");


        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaidCrows,3,8);

        adelaidCrows.matchResult(fremantle,2,1);

        footballLeague.add(adelaidCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();












    }
}
