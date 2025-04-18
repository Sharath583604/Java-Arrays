package Array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		int sum=0;
		System.out.println("Enter the elements");
		for(i=0;i<=n-1;i++) {
			a[i]=s.nextInt();
			
		}
		for(i=0;i<=n-1;i++) {
			sum =sum+a[i];
			
		}
		
		System.out.print("Sum of the elements are : "+sum);
	}

}
