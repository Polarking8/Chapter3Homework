package org.hillcrest.chapter3.student;
public class Student {
    private double totalScore;
    private double averageScore;
    private double numberOfQuizzes = 0;
    private double quizScore;
    private String StudentName;
    /**
     * Creates an instance of a student
     * @param StudentName the name of the student
     */
        public Student(String StudentName){
            this.StudentName = StudentName;
        }
    /**
     * Adds scores to the total score and increases number of quizzes taken
     * @param QuizScore the score of quizzes being added
     */
    public void addScore(int QuizScore) {
        totalScore += QuizScore;
        numberOfQuizzes = numberOfQuizzes + 1;
    }
    /**
     * Gets various variables
     * @return getTotalScore - returns the total score
     * @return getNumberOfQuizzes - returns number of quizzes taken
     * @return getStudentName - returns the student name
     */
    public double getTotalScore(){
            return totalScore;
        }
        public double getNumberOfQuizzes(){
            return numberOfQuizzes;
        }
        public String getStudentName() {
            return StudentName;
        }
    /**
     * Calculates the quiz average by dividing total score by number of quizzes
     * @return returns the average score
     */
    public double calculateQuizAverage() {
        averageScore = (totalScore / numberOfQuizzes);
        return averageScore;

    }
}



