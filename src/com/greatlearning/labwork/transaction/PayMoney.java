package com.greatlearning.labwork.transaction;
import java.util.Scanner;

public class PayMoney {
	public void searchArray(int array[], int targValue) {
		int sum =0;
		for (int i = 0; i<array.length; i++) {
			sum = sum + array[i];
			if (sum>=targValue) {
				System.out.println("Target is achieved after " + (i+1) +" transactions");
				break;
			}
		}
		if(sum< targValue)
			System.out.println("Target not acheived ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayMoney tranx = new PayMoney();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		int size = sc.nextInt();
		int array[] = new int [size];
		System.out.println("Enter the values of array ");
		for (int i = 0; i< size; i++) {
			array[i]= sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int target = sc.nextInt();
		for (int i = 1; i <= target; i++) {
			System.out.println("Enter the value of target ");
			int targValue = sc.nextInt();
			tranx.searchArray(array, targValue);
			System.out.println();
		}
		sc.close();
	}

}
