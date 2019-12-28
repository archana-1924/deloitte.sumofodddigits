package com.deloitte.test.assignment;
import java.util.*;

public class SumOfOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      System.out.println("Enter the number : ");
      Scanner sc= new Scanner(System.in);
      n=sc.nextInt();
      int temp=n;
      int sum=0;
    	  while(n!=0)
    	  {
    		  temp=n%10;
    		  if(temp%2!=0)
    		  {
    			  sum+=temp;
    		  }
    		  n=n/10;
    	  }
    	  System.out.println("Sum of odd digits in the number : "+sum);
          sc.close();
	}

}
