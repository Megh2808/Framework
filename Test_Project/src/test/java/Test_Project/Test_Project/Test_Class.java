package Test_Project.Test_Project;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Test_Class {

	@Test(description="To check if string comtains vowels")
	public void Test_1() {
		String s="This is String.";
		char c[]= {'a','b','c','d'};
		StringBuilder sbr=new StringBuilder("This is builder. ");	
		System.out.print(sbr.append(s));
	}
	
	@Test(description="To check palindrome")
	public void palindrome() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int rev=0;
		while(temp>0) {
        int rem=temp%10;
        rev=(rev*10)+rem;	
		temp=temp/10;	
		}
		
		if(a==rev) {
		System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");}
	}
	
}
