import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalCal = 0, totalPro = 0, totalCarb = 0, totalFat = 0;

        while (true) {

            System.out.print("Enter food (or exit): ");
            String food = sc.nextLine();

            if (food.equalsIgnoreCase("exit")) break;

            System.out.print("Calories: ");
            double cal = sc.nextDouble();

            System.out.print("Protein: ");
            double pro = sc.nextDouble();

            System.out.print("Carbs: ");
            double carb = sc.nextDouble();

            System.out.print("Fats: ");
            double fat = sc.nextDouble();

            // clear buffer
            sc.nextLine();

            // simple validation
            if (cal < 0 || pro < 0 || carb < 0 || fat < 0) {
                System.out.println("Invalid input (no negatives)");
                continue;
            }

            totalCal += cal;
            totalPro += pro;
            totalCarb += carb;
            totalFat += fat;
        }

        System.out.println("\nTotal Calories: " + totalCal);
        System.out.println("Protein: " + totalPro);
        System.out.println("Carbs: " + totalCarb);
        System.out.println("Fats: " + totalFat);

        sc.close();
    }
}
