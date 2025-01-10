package cap04.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student0 = new Student("Jane Green", 93.5);
        Student student1 = new Student("John Blue", 72.75);

        System.out.printf("%s's letter grade is: %s%n", student0.getName(), student0.getAverageLetter());
        System.out.printf("%s's letter grade is: %s%n", student1.getName(), student1.getAverageLetter());
    }
}
