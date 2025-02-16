import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

      System.out.println("");
      System.out.println("***********************************************************");

      System.out.println("THIS IS A STUDENT GRADE CALCULATOR:-\n");

      System.out.print("Enter the Student name: ");
      String name = scanner.nextLine();

      System.out.print("\nEnter the Course of the Student: ");
      String course = scanner.nextLine();

      System.out.print("\nEnter the Year of Study: ");
      int year = scanner.nextInt();
      scanner.nextLine();

      System.out.println("");
      System.out.println("***********************************************************");

      System.out.print("\nEnter the name of Subject-1: ");
      String Sub1 = scanner.nextLine();

      System.out.print("\nWhat are the marks obtained in Sub1 out of 100: ");
      Double Mark1 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("\nEnter the name of Subject-2: ");
      String Sub2 = scanner.nextLine();


      System.out.print("\nWhat are the marks obtained in Sub2 out of 100: ");
      Double Mark2 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("\nEnter the name of Subject-3: ");
      String Sub3 = scanner.nextLine();

      System.out.print("\nWhat are the marks obtained in Sub3 out of 100: ");
      Double Mark3 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("\nEnter the name of Subject-4: ");
      String Sub4 = scanner.nextLine();

      System.out.print("\nWhat are the marks obtained in Sub4 out of 100: ");
      Double Mark4 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("\nEnter the name of Subject-5: ");
      String Sub5 = scanner.nextLine();

      System.out.print("\nWhat are the marks obtained in Sub5 out of 100: ");
      Double Mark5 = scanner.nextDouble();

      System.out.println("");
      System.out.println("***********************************************************");
      
      Double TotalMarks = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
      System.out.print("\nThe Total marks obtained in all subjects are:" + TotalMarks);
      System.out.println("");

      System.out.println("");
      System.out.println("***********************************************************");

      System.out.print("\nEnter the total subjects of which result is made of: ");
      Double TotalSub = scanner.nextDouble();

      System.out.println("");
      System.out.println("***********************************************************");
      
      Double AP = TotalMarks/TotalSub;
      System.out.print("\nThe Average Percentage obtained by the student is: " + AP);
      System.out.println("");

      System.out.println("");
      System.out.println("***********************************************************");

      if(AP > 90 && AP <= 100)
      {
        System.out.print("\nThe respective Grade received by the student is: O");
      }
      else if(AP > 80 && AP <= 90)
      {
        System.out.print("\nThe respective Grade received by the student is: A+");
      }
      else if(AP > 70 && AP <= 80)
      {
        System.out.print("\nThe respective Grade received by the student is: A");
      }
      else if(AP > 60 && AP <= 70)
      {
        System.out.print("\nThe respective Grade received by the student is: B+");
      }
      else if(AP > 50 && AP <= 60)
      {
        System.out.print("\nThe respective Grade received by the student is: B");
      }
      else if(AP > 40 && AP <= 50)
      {
        System.out.print("\nThe respective Grade received by the student is: C");
      }
      else
      {
        System.out.print("\nThe respective Grade received by the student is: F");
      }
      System.out.println("");
      System.out.println("***********************************************************");

      scanner.close();
    }
}
