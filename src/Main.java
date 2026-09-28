import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        // Marks input
        System.out.println("\nEnter Marks (out of 100)");

        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Digital Logic Marks: ");
        int digital = sc.nextInt();

        // Check marks
        if (java < 0 || java > 100 ||
            maths < 0 || maths > 100 ||
            digital < 0 || digital > 100) {

            System.out.println("Invalid marks! Enter marks between 0 and 100.");

        } else {

            // Calculate total and average
            int total = java + maths + digital;
            double average = total / 3.0;

            System.out.println("\nMARKS DETAILS ");
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);

            // Calculate grade
            if (average >= 90) {
                System.out.println("Grade: A+");
            } else if (average >= 80) {
                System.out.println("Grade: A");
            } else if (average >= 70) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else if (average >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Needs Improvement");
            }
        }

        // Attendance input
        System.out.println("\nATTENDANCE DETAILS ");

        System.out.print("Enter Total Classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter Classes Attended: ");
        int attended = sc.nextInt();

        // Check attendance
        if (totalClasses <= 0 || attended < 0 ||
            attended > totalClasses) {

            System.out.println("Invalid attendance details!");

        } else {

            // Calculate attendance percentage
            double percentage = attended * 100.0 / totalClasses;

            System.out.println("Attendance: " + percentage + "%");

            if (percentage >= 75) {
                System.out.println("Attendance Eligible");
            } else {
                System.out.println("Attendance Below 75%");
            }
        }

        // Display student details
        System.out.println("\nSTUDENT DETAILS ");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);

        sc.close();
    }
}
