import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add student records (ID and Name). Type ID as 0 to stop.");

        while (true) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            if (id == 0) break;

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("Enter ID to retrieve name: ");
        int searchId = sc.nextInt();

        String result = studentMap.get(searchId);
        if (result != null) {
            System.out.println("Student Name: " + result);
        } else {
            System.out.println("No student found with ID " + searchId);
        }
        sc.close();
    }
}
