package assignments_folder;

import java.util.Arrays;

public class Assignment36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {12,67,56,45,34};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));
		
		//
		boolean ans = Arrays.equals(arr1, arr2);
		if(ans==true)
		{
	System.out.println("Arrays are equal");
		}
else
{
	System.out.println("Arrays are not equal");

}
	}

}
