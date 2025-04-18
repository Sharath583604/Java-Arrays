package Array;

import java.util.Random;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Even Array Elements are");
		for(i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
			
		}
	}

}
