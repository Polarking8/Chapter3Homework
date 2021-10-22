package org.hillcrest.chapter3.student;
public class Student {
    private int TotalScore;
    private int AverageScore;
    public int NumberOfQuizzes = 1;
    private int QuizScore;
    private String StudentName;
    /**
     * Creates an instance of a student
     * @param StudentName the name of the student
     * @param FirstQuizScore the first quiz
     */
        public Student(String StudentName, int FirstQuizScore){
            this.StudentName = StudentName;
            TotalScore = FirstQuizScore;
        }
    /**
     *
     * @param QuizScore the score of quizzes being added
     */
    public  void addScore(int QuizScore) {
        TotalScore += QuizScore;
        NumberOfQuizzes++;
    }
    public double getTotalScore(){
            return TotalScore;
        }
        public double getNumberOfQuizzes(){
            return NumberOfQuizzes;
        }
        public String getStudentName() {
            return StudentName;
        }
    }

