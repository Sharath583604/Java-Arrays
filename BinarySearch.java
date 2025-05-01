package Array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		int i,left, right,mid;
		System.out.println("enter the size of an array");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<=n-1;i++)
		{
			a[i]=s.nextInt();
		}
		left=0;
		right=a.length-1;
		System.out.println("Enter the element to be found");
		int x=s.nextInt();
		while(left<=right)
		{
			mid=(left+right)/2;
			if(x==a[mid])
			{
				System.out.println("Element found");
				return;
			}
			else if(x>a[mid])
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		System.out.println("Element Not found");

	}

}
