public class CounterStrike {
    public static void main(String[] args) {
    int team1 = 5;
    int team2 = 5;
        int player1Team1 = 5;
        int player2Team1 = 4;
        int player3Team1 = 3;
        int player4Team1 = 2;
        int player5Team1 = 1;

        int team2Player1 = 7;
        int team2Player2 = 3;
        int team2Player3 = 2;
        int team2Player4 = 5;
        int team2Player5 = 4;

        int resultTeam1 = player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1;
        int resultTeam2 = team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5;

        System.out.println("team1 набрала " + resultTeam1 + " очков " + "team2 набрала "+ resultTeam2 + "очков");
        System.out.println("Перемогла команда " + "team2 " + "набрала " + resultTeam2 + " очков" );
    }
}

