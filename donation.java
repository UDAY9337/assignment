import java.util.Scanner;
public class donation
{
  public static void main(String[] args)
  {
    int age,wgt;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your age :");
	age=sc.nextInt();
	System.out.print("enter your weight :");
	wgt=sc.nextInt();
	if(age>=25)
	{
	  if(wgt>=48)
	System.out.print("eligible to donate blood");
	else
	System.out.print("not eligible to donate blood");
	}
  }
}