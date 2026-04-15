import java.util.*;
class Student {
    String name;
    ArrayList<Integer> grades;
    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    void addGrade(int grade) {
        grades.add(grade);
    }

    double getAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.size() > 0 ? (double) sum / grades.size() : 0;
    }
    int getHighest() {
        return Collections.max(grades);
    }
    
    int getLowest() {
        return Collections.min(grades);
    }

   
    void displayReport() {
        System.out.println("\nStudent: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();

            Student s = new Student(name);

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade " + (j + 1) + ": ");
                int grade = sc.nextInt();
                s.addGrade(grade);
            }

            sc.nextLine(); 
            students.add(s);
        }

        
        System.out.println("\n===== STUDENT SUMMARY REPORT =====");

        for (Student s : students) {
            s.displayReport();
        }

        sc.close();
    }
}