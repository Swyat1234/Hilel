import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        int [] firstRugbyTeam = new int[25];
        int [] secondRugbyTeam = new int[25];
        Random random = new Random();
        int sumFirstRugbyTeam = 0;
        int sumSecondRugbyTeam = 0;
        int averageAgeFirst = 0;
        int averageAgeSecond = 0;
        for(int i = 0;i < firstRugbyTeam.length;i++){
            firstRugbyTeam[i] = random.nextInt(25) + 20;
            sumFirstRugbyTeam = sumFirstRugbyTeam + firstRugbyTeam[i];
            averageAgeFirst = sumFirstRugbyTeam / 25;
        }
        for(int i = 0;i < secondRugbyTeam.length;i++){
            secondRugbyTeam[i] = random.nextInt(25) + 20;
            sumSecondRugbyTeam = sumSecondRugbyTeam+ secondRugbyTeam[i];
            averageAgeSecond = sumSecondRugbyTeam / 25;
        }
        System.out.println("Команда номер 1: " + Arrays.toString(firstRugbyTeam));
        System.out.println("Суммарний возраст команды №1: " + sumFirstRugbyTeam);
        System.out.println("Средний возраст команды №1: " + averageAgeFirst);

        System.out.println("Команда номер 2: " + Arrays.toString(secondRugbyTeam));
        System.out.println("Суммарний возраст команды № 2: " + sumSecondRugbyTeam);
        System.out.println("Средний возраст команды №2: " + averageAgeSecond);
    }
}

