import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input: Integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Input: Double
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        // Input: Character
        System.out.print("Enter your grade (A/B/C): ");
        char grade = sc.next().charAt(0);

        // Input: Boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Output
        System.out.println("\n----- User Details -----");
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);
        
        sc.close();
    }
}

