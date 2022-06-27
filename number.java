import java.util.Scanner;
public class number
{
  public static void main(String[] args)
  {
    int no;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number :");
	no=sc.nextInt();
	if(no>0)
	System.out.print("positive number");
	else if(no<0)
	System.out.print("negative number");
	else
	System.out.println("the number is 0");
  }
}