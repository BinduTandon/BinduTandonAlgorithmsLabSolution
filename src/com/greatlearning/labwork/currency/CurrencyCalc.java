package com.greatlearning.labwork.currency;

import java.util.Scanner;

public class CurrencyCalc {

	public static void mergeSort(int array[], int low, int high) {
		if (low<high) {
			int mid = (low+high)/2;
			mergeSort(array, low, mid);
			mergeSort(array, mid+1, high);
			merge(array, low, high, mid);
		}

	}
	public  static void merge(int[] array, int low, int high, int mid) {
		int length1 = mid - low +1;
		int length2 = high - mid;

		int leftArr[] = new int [length1];
		int rightArr[] = new int [length2];

		for (int i = 0; i<length1; i++)
			leftArr[i]= array[low+i];
		for (int j= 0; j <length2; j++)
			rightArr[j]= array[mid+1+j]; 
		int i,j,key;
		i=0;
		j=0;
		key=low ;

		while (i<length1 && j<length2) {
			if (leftArr[i]>= rightArr[j]) {
				array[key]= leftArr[i];
				i++;
			}
			else {
				array[key]= rightArr[j];
				j++;
			}
			key++;
		}

		while (i<length1) {
			array[key]=leftArr[i];
			i++;
			key++;
		}

		while (j<length2) {
			array[key]=rightArr[j];
			j++;
			key++;
		}
	}
	public static void display(int []arr) {
		int size = arr.length;
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the denominations array ");
		int size = sc.nextInt();
		int array[] = new int [size];
		for (int i = 0; i< size; i++) {
			System.out.println("Enter the different denominations  ");
			array[i]= sc.nextInt();
		}
		mergeSort(array, 0, array.length-1);
		System.out.println("The denominations array is as follows: ");
		display(array);
		System.out.println("Enter the amount you want to pay ");
		int amount = sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be :");
		for (int i = 0; i< array.length; i++) {
			if(amount > array[i]) {
				int notes = amount/array[i];
				System.out.println(array[i]+ " : "+notes);
				amount = amount % array[i];
			}
		}
		if (amount >0)
			System.out.println("Remaining amount : "+amount);
		sc.close();
	}
}
