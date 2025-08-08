public class Student {
    String name = "";
    int age;
    String course = "";
    double grade1;
    double grade2;
    double grade3;
    double average;
    boolean available;

    public Student(){
        available = true;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", " + "Age: " + age + ", " + "Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);

    }

    public void setStudentDetails(String nameDetails, int ageDetails, String courseDetails){
        name = nameDetails;
        age = ageDetails;
        course = courseDetails;
    }

    public void setGradesDetails(double grade1Details, double grade2Details, double grade3Details){
        grade1 = grade1Details;
        grade2 = grade2Details;
        grade3 = grade3Details;
    }


    public void calculateAverage() {
        double sum = grade1 + grade2 + grade3;
        average = sum / 3;
        System.out.println("Average: " + average);
    }

    public void getLetterGrade(){
        if (average >= 90.00){
            System.out.println("Letter Grade: A");
        }
        else if (average <= 69){
            System.out.println("Letter Grade: D");
        }
        else if (average <= 79){
            System.out.println("Letter Grade: C");
        }
        else if (average <= 89){
            System.out.println("Letter Grade: B");
        }
        else {
            System.out.println("Letter Grade: F");
        }
    }
    public void isPassing(){
        if (average >= 70){
            System.out.println("Status: PASSING");
        }
        else {
            System.out.println("Status: FAILED");
        }
        System.out.println(" ");
    }
}