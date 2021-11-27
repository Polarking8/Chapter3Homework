package org.hillcrest.chapter3.student;

import java.io.PrintStream;

public class StudentTester {
        public static void main(String[] args) {
            String StudentName = "Kenobi";
            Student student1 = new Student(StudentName);
            student1.addScore(99);
            student1.addScore(95);
            System.out.printf("The current total score is now: %.2f \n", student1.getTotalScore());
            System.out.printf("The current average score is now: %.2f ", student1.calculateQuizAverage());
        }
}
