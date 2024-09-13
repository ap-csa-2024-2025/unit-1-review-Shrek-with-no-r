public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = ("Linear Algebra");
    int averageMinutes = 10068;
    int firstHwrade = 96;
    int secondHwGrade = 94;
    int thirdHwGrade = 99;
    int fourthGHwrade = 91;
    double quiz1 = 100;
    double quiz2 = 99.9;
    
    double hwAvg = ((firstHwrade + secondHwGrade + thirdHwGrade + fourthGHwrade) / 4);
    double quizAvg = ((quiz1 + quiz2) / 2);
    double finalExam = 0.1;

    double finalGrade = ((int)((hwAvg * 35) + (quizAvg * 10) + (finalExam * 50)) / 100);
    
    System.out.println("Course Name: " + courseName);
    System.out.println("Average homework grade: " + hwAvg);
    System.out.println("Average Quiz grade: " + quizAvg);
    System.out.println("overall grade: " + finalGrade);
    
    if (finalGrade < 50)
    {
      System.out.println("how tf did you spend " + averageMinutes + " minutes and still fail");
    }
  }
}
