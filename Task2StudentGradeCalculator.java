import java.util.Scanner;
class StudentGradeCalculator
{
    public static void main(String args[])
    {
        Scanner task2obj=new Scanner(System.in);
        System.out.println("This is Task 2 that is Student Grade Calculator");
        System.out.println("Enter how many subjects are there");
        int nos=task2obj.nextInt();
        int tot=0;
        for(int j=0;j<nos;j++)
        {
            System.out.println("Enter marks obtained in Subject"+(j+1)+": ");
            int marks=task2obj.nextInt();
            tot+=marks;
        }
        double avgper=(double)tot/nos;
    char Grade;
    if(avgper>=90)
    {
        Grade='O';
    }
    else if(avgper>=80)
    {
        Grade='A';
    }
    else if(avgper>=70)
    {
        Grade='B';
    }
    else if(avgper>=60)
    {
        Grade='C';
    }
    else if(avgper>=50)
    {
        Grade='D';
    }
    else if(avgper>=40)
    {
        Grade='E';
    }
    else
    {
        Grade='F';
    }
    System.out.println("Total Marks Scored :" +tot);
    System.out.println("Average Percentage :" +avgper+ "%");
    System.out.println("Grade :"+Grade);
    task2obj.close();

    }
}