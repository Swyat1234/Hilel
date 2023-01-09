import java.util.Scanner;

public class CounterStrike {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя команды");
        String team1Name = scanner.next();

        System.out.println("Введите количество очков");
        int team1Player1 = scanner.nextInt();
        int team1Player2 = scanner.nextInt();
        int team1Player3 = scanner.nextInt();
        int team1Player4 = scanner.nextInt();
        int team1Player5 = scanner.nextInt();
        int resultTeam1 = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5;

        System.out.println("Введите имя команды №2");
        String team2Name = scanner.next();

        System.out.println("Введите количество очков игроков");
        int team2Player1 = scanner.nextInt();
        int team2Player2 = scanner.nextInt();
        int team2Player3 = scanner.nextInt();
        int team2Player4 = scanner.nextInt();
        int team2Player5 = scanner.nextInt();
        int resultTeam2 = (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5;

        if(resultTeam1 < resultTeam2){
            System.out.println("Перемогла команда " + team2Name + " " + resultTeam2 + " очков");
        } else if (resultTeam1 > resultTeam2) {
            System.out.println("Перемогла команда " + team1Name + " "+ resultTeam1 + " очков");
        }else if(resultTeam1 == resultTeam2){
            System.out.println("Draw");
        }
    }
}


