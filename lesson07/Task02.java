package lesson7.lt.lhu.lesson07;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		int[] mas = new int[6];
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Please enter the numbers for arrays:");
			mas[i] = keyboard.nextInt();

		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}
		}
		System.out.println("Number of 0  =  " + count);
		int[] arnew = new int[count];
		System.out.println("New array   =  " + arnew.length);
		keyboard.close();
	}
}
