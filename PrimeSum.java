package Array;

import java.util.Scanner;

public class PrimeSum {
	static int primeNumber(int n)
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
			return n;
		}
		return 0;
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
		System.out.print(" Sum of Prime numbers Are : ");
		int sem=0;
		for(i=0;i<=n-1;i++)
		{
			int sum=primeNumber(a[i]);
			sem=sem+sum;
		}
		System.out.println(sem);
}
}
