import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create immutable list of armors
        List<Armor> armors = List.of(
                new Helmet(1.5, 150, "Steel Helmet"),
                new Breastplate(4.0, 250, "Iron Breastplate"),
                new Helmet(2.0, 180, "Golden Helmet"),
                new Breastplate(5.0, 300, "Diamond Breastplate"),
                new Helmet(0.8, 120, "Iron Helmet"),
                new Breastplate(1.2, 100, "Golden Breastplate")
        );

        // Calculate total cost of all armors
        double totalCost = armors.stream().mapToDouble(Armor::getPrice).sum();
        System.out.println("Total cost of equipment: $" + totalCost);

        // Sort and display armors by weight
        armors.stream()
                .sorted(Comparator.comparingDouble(Armor::getWeight))
                .forEach(Main::printArmor);

        // User input handling with exception catching
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("\nEnter minimum price: ");
            double minPrice = scanner.nextDouble();
            System.out.print("Enter maximum price: ");
            double maxPrice = scanner.nextDouble();

            // Filter armors by price range
            List<Armor> filteredArmors = armors.stream()
                    .filter(a -> a.getPrice() >= minPrice && a.getPrice() <= maxPrice)
                    .toList();

            System.out.println("\nArmor within the price range:");
            filteredArmors.forEach(Main::printArmor);
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers for the price.");
        }

        // Equip all armors
        System.out.println("\nEquipping armor:");
        armors.forEach(Armor::equip);
    }

    // Method to print armor details
    public static void printArmor(Armor armor) {
        System.out.println(armor.getName() + " (Weight: " + armor.getWeight() + " kg, Price: $" + armor.getPrice() + ")");
    }
}
