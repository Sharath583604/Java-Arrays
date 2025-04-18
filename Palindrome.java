package Array;

import java.util.Scanner;

public class Palindrome {
	static void palindrome(int n)
	{
		int r,rev=0;
		int copy=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(copy==rev)
		{
			System.out.print(copy+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		System.out.println("Enter the elements");
		for(i=0;i<=n-1;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.print("Palindrome Numbers Are : ");
		for(i=0;i<=n-1;i++)
		{
			palindrome(a[i]);
		}
	}

}
