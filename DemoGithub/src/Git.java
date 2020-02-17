import java.util.Scanner;

public class Git 
{
	public static void main(String[] args) {
		int a[]= {10,15,12,13,9};
		for(int i=0;i<=a.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
	    }
	}

}
