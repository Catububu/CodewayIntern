package codeway_prgrms;
import java.util.Scanner;
public class Task_2_StudentGrade
{
	public static void subjects(String sub1, String sub2, String sub3, String sub4, String sub5)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter marks for each subject respectively");
		int sub1_marks=s.nextInt();
		int sub2_marks=s.nextInt();
		int sub3_marks=s.nextInt();
		int sub4_marks=s.nextInt();
		int sub5_marks=s.nextInt();
		int sum=0;
		float avg=0f;
		sum= sub1_marks+ sub2_marks+ sub3_marks+sub4_marks+sub5_marks;
		System.out.println("Total marks= "+sum);
		avg=sum/5;
		System.out.println("Average percentage is= "+avg+"%");
		if(avg==100)
		{
			System.out.println("Grade = O");
			System.out.println("Grade description is : Otstanding");
		}
		else if(avg>=90.0 && avg<=99.9 )
		{
			System.out.println("Grade = A+");
			System.out.println("Grade description is : Excellent");
		}
		else if(avg>=80.0 && avg<=89.9 )
		{
			System.out.println("Grade = A");
			System.out.println("Grade description is : Very good");
		}
		else if(avg>=70.0 && avg<=79.9 )
		{
			System.out.println("Grade = B+");
			System.out.println("Grade description is : Good");
		}
		else if(avg>=60.0 && avg<=69.9 )
		{
			System.out.println("Grade = B");
			System.out.println("Grade description is : Above average");
		}
		else if(avg>=50.0 && avg<=59.9 )
		{
			System.out.println("Grade = C");
			System.out.println("Grade description is : Average");
		}
		else if(avg>=40.0 && avg<=49.9 )
		{
			System.out.println("Grade = C");
			System.out.println("Grade description is : Pass");
		}
		else if(avg>=0 && avg<=39.9 )
		{
			System.out.println("Grade = F");
			System.out.println("Grade description is : Fail");
		}
  }
  public static void main(String[] args) 
	{
		subjects("C programming","Descrete mathematics","Java programming","satistics and probability","Python programming");
	}
}
