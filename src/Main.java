//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// imported Random object module
import java.util.Random;
// Defined main class
public class Main {
    // Defined Main method
    public static void main(String[] args) {
        // Invoke/Call all methods
        calculateCrimeRisk();
        calculateEarthquakeRisk();
        calculateFloodRisk();
        totalCalculatedRisk();
    }
    // Defined calculatedCrimeRisk method
    public static int calculateCrimeRisk(){
        // create Random object
        Random random = new Random();
        // Generate random number from 0 to 100
        int num = random.nextInt(101);
        // Return result
        return  num;
    }

    // Defined calculatedEarthquakeRisk method
    public static int calculateEarthquakeRisk(){
        // create Random object
        Random random = new Random();
        // Generate random number from 0 to 100
        int num = random.nextInt(101);
        // Return result
        return  num;

    }
    // Defined calculatedFloodRisk method
    public static int calculateFloodRisk(){
        // Create Random object
        Random random = new Random();
        // Generate random number from 0 to 100
        int num = random.nextInt(101);
        // Return result
        return  num;
    }

    // Defined totalCalculatedRisk method
    public static int totalCalculatedRisk(){
        // Initialized variable to store methods
        int a = calculateCrimeRisk();
        int b = calculateEarthquakeRisk();
        int c = calculateFloodRisk();

        // Sum each returned values into 1 variable
        int result = a + b + c;

        // Print to console result
        System.out.println("The total calculated risk level is" + " " + result);
        // Return result
        return result;
    }

}