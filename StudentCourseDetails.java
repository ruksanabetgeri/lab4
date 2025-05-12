package lab4;

public class StudentCourseDetails {
    String name, program;
    int semester;
    String[] courses = {"Math", "Java", "DBMS"};
    int[] marks = {75, 35, 85};

    public void showDetails() {
        System.out.println("Name: " + name + ", Program: " + program + ", Semester: " + semester);
    }

    public void showLowMarks() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40)
                System.out.println(courses[i] + ": " + marks[i]);
        }
    }
}





