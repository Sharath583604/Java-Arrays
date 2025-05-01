package DataStructure;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,j;
		System.out.println("Enter the Array elements");
		for(i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sorted Array is");
		for(j=0;j<=a.length-1;j++)
		{
			for(i=0;i<=a.length-2;i++)
			{
				if(a[i]>a[i+1]) {
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
				}
			}			
		}
	
		for(j=0;j<=a.length-1;j++)
		{
			System.out.print(a[j]+" ");
		}
	}

}
