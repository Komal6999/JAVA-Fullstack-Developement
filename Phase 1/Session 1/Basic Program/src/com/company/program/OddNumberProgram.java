// Display Odd Numbers Examples

package com.company.program;

public class OddNumberProgram {

	public static void main(String[] args) {
		
		int number=50;
		System.out.println("List of Odd Numbers from 1 to "+number+":");
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+"");
			}
		}
		

	}

}
