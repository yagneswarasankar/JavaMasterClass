package chapters.chapter10.Generics.OurGenericsClass;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaidCrows = new Team<>("AdelaidCrows");
        adelaidCrows.addPlayer(joe);
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Clubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("soccerteam");
        soccerTeam.addPlayer(beckham);

        System.out.println(adelaidCrows.numPlayers());

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("ordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthort");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaidCrows,3,8);

        adelaidCrows.matchResult(fremantle,2,1);

        System.out.println("Rankings : ");

        System.out.println(adelaidCrows.getName()+": "+ adelaidCrows.ranking());
        System.out.println(melbourne.getName()+": "+ melbourne.ranking());
        System.out.println(fremantle.getName()+": "+ fremantle.ranking());
        System.out.println(hawthorn.getName()+": "+ hawthorn.ranking());

        System.out.println(adelaidCrows.compareTo(melbourne));
        System.out.println(adelaidCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaidCrows));
        System.out.println(melbourne.compareTo(fremantle));

    }
}
