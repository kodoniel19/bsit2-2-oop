public class Main {
    public static void main(String[] args) {
        int totalStudents = 0;
        int passingCount = 0;

        System.out.println("Student Information:");

        Student student1 = new Student();
        student1.setStudentDetails("Alice", 20, "BSIT");
        student1.setGradesDetails(85.0, 90.0, 88.0);
        student1.displayInfo();
        student1.calculateAverage();
        student1.getLetterGrade();
        student1.isPassing();
        if (student1.average >= 70) {
            passingCount++;
        }
        totalStudents++;

        Student student2 = new Student();
        student2.setStudentDetails("Bob", 19, "BSCS");
        student2.setGradesDetails(92.0, 95.0, 89.0);
        student2.displayInfo();
        student2.calculateAverage();
        student2.getLetterGrade();
        student2.isPassing();
        if (student2.average >= 70) {
            passingCount++;
        }
        totalStudents++;

        Student student3 = new Student();
        student3.setStudentDetails("Charlie", 21, "BSIT");
        student3.setGradesDetails(65.0, 70.0, 68.0);
        student3.displayInfo();
        student3.calculateAverage();
        student3.getLetterGrade();
        student3.isPassing();
        if (student3.average >= 70) {
            passingCount++;
        }
        totalStudents++;

        System.out.println("Summary: " + passingCount + " out of " + totalStudents + " students are passing.");
    }
}

}
