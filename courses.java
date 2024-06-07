/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class courses {
  private static final String[] COURSE_IDS = {"BSE", "BIT", "BCS", "BCE"};
    private static final String[] COURSE_NAMES = {
        "Software Engineering",
        "Information Technology",
        "Computer Science",
        "Computer Engineering"
    };
    private static final int[] TUITION_FEES = {900000, 750000, 800000, 950000};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the applicant to enter the CourseID
        System.out.print("Enter CourseID: ");
        String courseID = scanner.nextLine().trim().toUpperCase();

        // Find and display the course details
        boolean courseFound = false;
        for (int i = 0; i < COURSE_IDS.length; i++) {
            if (COURSE_IDS[i].equals(courseID)) {
                System.out.println("Course Name: " + COURSE_NAMES[i]);
                System.out.println("Tuition Fees: " + TUITION_FEES[i]);
                courseFound = true;
                break;
            }
        }

        // If the course is not found, display an error message
        if (!courseFound) {
            System.out.println("Wrong CourseID details");
        }

        scanner.close();
    }
}
