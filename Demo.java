package Array;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int i;
		Random rand=new Random();
		System.out.println("Enter the element of an Array");
		for(i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are");
		for(i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
