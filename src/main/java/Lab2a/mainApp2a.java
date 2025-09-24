package Lab2a;

public class mainApp2a {
	public static void main(String[] args) {
		Score k = new Score();
		k.setQuiz(90);
		k.setMidTExam(70);
		k.setFinalExam(85);
		System.out.println("Quiz		: " + k.Quiz);
		System.out.println("Midterm Exam: " + k.MidTExam);
		System.out.println("Final Exam : " + k.FinalExam);
		System.out.println("Total Score : " + k.getScore());
		System.out.println("Letter Grade: " + k.getGrade());
		System.out.println("Comment	: " + k.getComment());
	}
}
