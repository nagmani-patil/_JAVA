//You are given integer marks of 3 subjects (can be float).
//Print average, highest, and grade (A/B/C).
import java.util.Scanner;
public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 3 subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double avg = (m1 + m2 + m3) / 3;
        double max = Math.max(m1, Math.max(m2, m3));

        char grade;
        if (avg >= 85) grade = 'A';
        else if (avg >= 60) grade = 'B';
        else grade = 'C';

        System.out.printf("Average: %.2f%nHighest: %.2f%nGrade: %c%n", avg, max, grade);
    }
}
