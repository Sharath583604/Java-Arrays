package Array;

import java.util.Scanner;

public class PrimeNumber {
	static void primeNumber(int n)
	{
		int count=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}		
		}
		if(count==2)
		{
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		System.out.println("Enter the elements");
		for(i=0;i<=n-1;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.print("Prime numbers Are : ");
		for(i=0;i<=n-1;i++)
		{
			primeNumber(a[i]);
		}
	}

}
