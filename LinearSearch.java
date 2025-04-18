package Array;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,count=0;
		System.out.println("Enter the element of an Array");
		for(i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to be search");
		int x=sc.nextInt();
		
		for(i=0;i<=a.length-1;i++)
		{
			if(a[i]==x)
			{
			count++;
			}
		}
			System.out.println("Element is found "+count+" times");

	}

}
