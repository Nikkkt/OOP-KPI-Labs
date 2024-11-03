import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Armor> armors = List.of(
                new Helmet(1.5, 150, "Steel Helmet"),
                new Breastplate(4.0, 250, "Iron Breastplate"),
                new Helmet(2.0, 180, "Golden Helmet"),
                new Breastplate(5.0, 300, "Diamond Breastplate"),
                new Helmet(0.8, 120, "Iron Helmet"),
                new Breastplate(1.2, 100, "Golden Breastplate")
        );

        double totalCost = armors.stream().mapToDouble(Armor::getPrice).sum();
        System.out.println("Total cost of equipment: $" + totalCost);

//        armors.stream()
//                .sorted(Comparator.comparingDouble(Armor::getWeight))
//                .forEach(Main::printArmor);

        armors.stream()
                .sorted(Comparator.comparingDouble(Armor::getWeight).reversed())
                .forEach(Main::printArmor);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("\nEnter minimum price: ");
            double minPrice = scanner.nextDouble();
            System.out.print("Enter maximum price: ");
            double maxPrice = scanner.nextDouble();

            List<Armor> filteredArmors = armors.stream()
                    .filter(a -> a.getPrice() >= minPrice && a.getPrice() <= maxPrice)
                    .toList();

            System.out.println("\nArmor within the price range:");
            filteredArmors.forEach(Main::printArmor);
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers for the price.");
        }

        System.out.println("\nEquipping armor:");
        armors.forEach(Armor::equip);
    }

    public static void printArmor(Armor armor) {
        System.out.println(armor.getName() + " (Weight: " + armor.getWeight() + " kg, Price: $" + armor.getPrice() + ")");
    }
}
