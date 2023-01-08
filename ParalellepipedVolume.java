import java.util.Scanner;

public class ParalellepipedVolume {
    public static void main(String[] args) {
        System.out.println("Введите стороны параллелепипеда");
        System.out.println(getParalellepipedVolume());
    }
    public static int getParalellepipedVolume (){
        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        return sideA * sideB * sideC;
    }
}
