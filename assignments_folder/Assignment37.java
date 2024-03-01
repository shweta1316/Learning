package assignments_folder;

import java.util.Arrays;

public class Assignment37 {
	public static void main(String[] args) {
		String Test = "9090";
		int digcount=0;
		int stringcount=0;
		char test[] = Test.toCharArray();
		System.out.println(Arrays.toString(test));
		for (int i=0;i<test.length;i++)
		{
			boolean ans= Character.isDigit(test[i]);
			if(ans==true)
			{
				digcount++;
			}
			else
			{
				stringcount++;

			}

		}
		if(stringcount>0)
		{
			System.out.println("String is not just made up of digits");

		}
		else
		{			System.out.println("String is  just made up of digits");
		}
	}

}

