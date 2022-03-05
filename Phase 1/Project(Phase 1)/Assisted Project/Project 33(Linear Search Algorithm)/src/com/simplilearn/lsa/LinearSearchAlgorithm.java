package com.simplilearn.lsa;


class LinearSearch {  
static int linearSearch(int a[], int n, int val) {  
  // Going through array sequencially  
  for (int i = 0; i < n; i++)  
    {  
        if (a[i] == val)  
        return i+1;  
    }  
  return -1;  
}  
public static void main(String args[]) {  
  int a[] = {55, 29, 10, 40, 57, 41, 20, 24, 45}; // given array  
  int val = 10; // value to be searched  
  int n = a.length; // size of array  
  int res = linearSearch(a, n, val); // Store result  
  System.out.println();  
  System.out.print("The elements of the array are - ");  
  for (int i = 0; i < n; i++)  
  System.out.print(" " + a[i]);  
  System.out.println();  
  System.out.println("Element to be searched is - " + val);  
  if (res == -1)  
  System.out.println("Element is not present in the array");  
  else  
  System.out.println("Element is present at " + res +" position of array");  
}  
}  
