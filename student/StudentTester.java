package org.hillcrest.chapter3.student;

public class StudentTester {
        public static void main(String[] args) {
            String StudentName = "Kenobi";
            Student student1 = new Student(StudentName, 93);
            student1.addScore(99);
            student1.addScore(95);
            System.out.println("The current total score is now: " + student1.getTotalScore());
            System.out.printf("The current average score is now: "+ student1.getTotalScore() / student1.getNumberOfQuizzes());
        }
}
