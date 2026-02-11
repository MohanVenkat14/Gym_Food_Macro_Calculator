import java.util.Scanner;

public class GymFoodMacrosCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String foodItem;
        double totalCalories = 0, totalProtein = 0, totalCarbs = 0, totalFats = 0;

        while (true) {
            System.out.print("Enter food item name (or type 'exit' to stop): ");
            foodItem = scanner.nextLine().trim();

            if (foodItem.equalsIgnoreCase("exit")) {
                break;
            }
            double calories = getValidDoubleInput(scanner, "Enter calories for " + foodItem + ": ");
            double protein = getValidDoubleInput(scanner, "Enter protein (g) for " + foodItem + ": ");
            double carbs = getValidDoubleInput(scanner, "Enter carbs (g) for " + foodItem + ": ");
            double fats = getValidDoubleInput(scanner, "Enter fats (g) for " + foodItem + ": ");

            totalCalories += calories;
            totalProtein += protein;
            totalCarbs += carbs;
            totalFats += fats;
        }

        System.out.println("\nTotal Macros:");
        System.out.println("Calories: " + totalCalories);
        System.out.println("Protein: " + totalProtein + "g");
        System.out.println("Carbs: " + totalCarbs + "g");
        System.out.println("Fats: " + totalFats + "g");

        scanner.close();
    }

    private static double getValidDoubleInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Double.parseDouble(scanner.nextLine().trim());
                if (value < 0) {
                    System.out.println("Please enter a non-negative value.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
}