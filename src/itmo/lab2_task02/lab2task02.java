package itmo.lab2_task02;

public class lab2task02 {
    public static void main(String[] args) {
        Car bmwBlack = new Car("BMW", "M3", Color.BLACK, 300000, 150, true);
        Car mercedesWhite = new Car("Mercedes", "S-Class", Color.WHITE, 600000, 170, true);

        System.out.println(bmwBlack.toString());
        System.out.println(bmwBlack.getInfoDiscount(30));
        System.out.println("\n");
        System.out.println(mercedesWhite.toString());
        System.out.println(mercedesWhite.getInfoDiscount(20));
    }
}
