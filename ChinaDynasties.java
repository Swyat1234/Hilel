public class ChinaDynasties {
    public static void main(String[] args) {
        int leeWarriorDamage = 13;
        int leeBowerDamage = 24;
        int leeRiderDamage = 46;
        int minWarriorDamage = 9;
        int minBowerDamage = 35;
        int minRiderDamage = 12;
        int leeArmyCount = 860;
        double minArmyCount = leeArmyCount * 1.5;
        int leeArmyDamage = (leeBowerDamage * 860) + (leeRiderDamage * 860) + (leeWarriorDamage * 860);
        double minArmyDamage = (minBowerDamage * minArmyCount) + (minRiderDamage * minArmyCount) + (minWarriorDamage * minArmyCount);
        System.out.println("Атака армии Ли: " + leeArmyDamage);
        System.out.println("Атака армии Минь: " + minArmyDamage);
    }
}
