package com.qa;

public class MisssingNumbers {

	public static void main(String[] args) {

		int []num1= {1,2,2,4,5,5,7,9,8,9,10};
		int[]str=new int[num1.length];
		for(int value:num1) {
			str[value]=1;
		}
		System.out.println("missing no are ::");
		for(int i=1;i<=str.length-1;i++) {
			if(str[i]==0) {
				System.out.println(i);
			}
		}
	}
}
