package com.company.lis;

import java.util.*;

public class LongestIncreasingSubsequence {
	
	public static int longestIncreasingSubSequence(int[] arr,int n) {
		
		
		ArrayList<Integer>temp=new ArrayList<>();

		int count=0;
		if(n==1) 
			return 1;
		for(int i=0;i<n-1;i++) {
			 temp.add(arr[i]);
			
			for(int j=i;j<n;j++) {
				if(arr[j]>arr[i]) {
					temp.add(arr[j]);
					arr[i]=arr[j];
	         	}    
		  }
			if(temp.size()>count)
				{
				count=temp.size();
				}
			temp.removeAll(temp);
		}	
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of Array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];

		System.out.println("Enter Array of integer : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res=longestIncreasingSubSequence(arr,n);
		System.out.println("longest subsquence : "+res);
	}

}
