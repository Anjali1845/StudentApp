import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> students = new ArrayList<>();

    public static void addStudent(String name) {
        students.add(name);
    }

    public static void viewStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Student App!");

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    addStudent(name);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}