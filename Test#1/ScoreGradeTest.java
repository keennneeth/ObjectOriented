import java.util.Scanner;

public class ScoreGradeTest

{

    public static void main(String[] args)
    {

        
ScoreGrade test = new ScoreGrade();

Scanner score1 = new Scanner(System.in);

        System.out.print("Exam 1: ");
        double exam1 = score1.nextDouble();

        System.out.print("Exam 2: ");
        double exam2 = score1.nextDouble();

        System.out.print("Exam 3: ");
        double exam3 = score1.nextDouble();

        System.out.println ("The average is:  " + test.CalculateAverage(exam1, exam2, exam3));
        System.out.println ("The Max is: " + test.MaxScore());
    }
}
