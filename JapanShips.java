public class JapanShips {
    public static void main(String[] args) {
        int numberOfShips = 100;
        for(int i = 1; i <= numberOfShips ; i++){
            if (i % 10 == 4 || i % 10 == 9 || i / 10 == 4 || i / 10 == 9 || i / 10 == 14 || i / 10 == 19){
                System.out.println("Несчасливый номер удалён");
                numberOfShips++;
                continue;
            }
            System.out.println("Номер корабля " + i);
        }
    }
}
