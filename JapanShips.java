public class JapanShips {
    public static void main(String[] args) {
        for(int numberOfShips = 1; numberOfShips < 101 ; numberOfShips++){
            if (numberOfShips % 10 == 4 || numberOfShips % 10 == 9 || numberOfShips / 10 == 4 || numberOfShips / 10 == 9){
                System.out.println("Несчасливый номер удалён");
                continue;
            }
            System.out.println("Номер корабля " + numberOfShips);
        }
        }
    }

