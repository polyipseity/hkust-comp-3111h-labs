package Lab2a;

public class Score {
    /* A class contains attributes[A], constructor[C], and methods[M]. */
    /* [A] Attribute List */
    double Quiz, MidTExam, FinalExam, Score; char grade;
    String comment;

    /* [C] Constructor: to initialize value to the object through parameter. */
    Score(){
        Quiz = 0;
        MidTExam = 0;
        FinalExam = 0;
    }

    /* [M] Method */
    void setQuiz(double x) { Quiz = x; }
    void setMidTExam(double x) { MidTExam = x; }
    void setFinalExam(double x) { FinalExam = x; }

    double getScore() {
        Score = 0.2*Quiz + 0.3*MidTExam + 0.5*FinalExam;
        return Score;
    }

    char getGrade() {
        if(Score >=80 && Score <= 100) grade = 'A';
        else if(Score >= 65 && Score < 80) grade = 'B';
        else if(Score > 50 && Score < 65) grade = 'C';
        else if(Score > 40 && Score < 50) grade = 'D';
        else grade = 'E'; return grade;
    }

    String getComment(){
        if(grade == 'A') comment = "Very Good";
        else if(grade == 'B') comment = "Good";
        else if(grade == 'C') comment = "Not Bad";
        else if(grade == 'D') comment = "Bad";
        else comment = "Very Bad"; return comment;
    }

}