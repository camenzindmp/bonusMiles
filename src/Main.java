public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15000;
        int spentForBonus = 20;
        int bonusMiles = 1;

        int accuredBonus = ticketPrice / spentForBonus * bonusMiles;
        System.out.println(accuredBonus);
    }
}
