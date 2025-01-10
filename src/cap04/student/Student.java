package cap04.student;

public class Student {
    String name;
    double average;

    public Student(String name, double average) {
        this.name = name;

        if (average > 0 && average <=100)
            this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage(double studenAverege) {

        return average;
    }

    public void setAverage(double average) {
        if(average > 0 && average <= 100){
            this.average = average;
        }
    }

    public String getAverageLetter(){
        String letterGrade = "";

        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return  letterGrade;
    }
}
