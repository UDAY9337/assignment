import java.util.Scanner;
public class vote
{
  public static void main(String[] args)
  {
    int age;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your age :");
	age=sc.nextInt();
	if(age>=18)
	System.out.print("eligible for vote");
	else
	System.out.print("not eligible to vote");
  }
}