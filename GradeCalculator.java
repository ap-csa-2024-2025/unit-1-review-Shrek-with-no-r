public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = ("Linear Algebra");
    int weeklyMinutesSpent = 10068;
    int firstHwGrade = 96;
    int secondHwGrade = 94;
    int thirdHwGrade = 99;
    int fourthHwGrade = 91;
    double quiz1 = 100;
    double quiz2 = 99.9;
    
    double hwAvg = ((firstHwGrade + secondHwGrade + thirdHwGrade + fourthHwGrade) / 4);
    double quizAvg = ((quiz1 + quiz2) / 2);
    double finalExam = 0.1;

    double finalGrade = ((int)((hwAvg * 35) + (quizAvg * 10) + (finalExam * 50)) / 100);
    
    System.out.println("Course Name: " + courseName);
    System.out.println("Minutes spent in a week: " + (weeklyMinutesSpent));
    System.out.println("hours spent in a week: " + ( ((weeklyMinutesSpent/60)) + "h " + (weeklyMinutesSpent % 60 + "m") ));
    System.out.println("Average homework grade: " + hwAvg);
    System.out.println("Average Quiz grade: " + quizAvg);
    System.out.println("overall grade: " + finalGrade);
    
    if (finalGrade < 50)
    {
      System.out.println("how tf did you spend " + weeklyMinutesSpent + " minutes and still fail");
    }
  }
}
