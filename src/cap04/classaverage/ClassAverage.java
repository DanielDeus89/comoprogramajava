package cap04.classaverage;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int gradeTotal = 1;

        while (gradeTotal <= 10){
            System.out.print("Enter Grade: ");
            int grade = scanner.nextInt();
            total += grade;
            gradeTotal++;
        }

        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n",total);
        System.out.printf("Class average is %d%n", average);
    }
}
