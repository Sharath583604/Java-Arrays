package Array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int i;
		System.out.print("Enter the elements of an Array : ");
		for(i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int j;
		for(i=0,j=a.length-1;i<j;i++,j--)
		{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
		}
		System.out.print("Reverse of an Array is : ");
		for(i=0;i<=a.length-1;i++)
		{
		System.out.print(a[i]+" ");
		}
		

	}

}
