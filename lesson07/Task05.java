package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task05 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		Random inPutNum = new Random();
		int count = 0;
		int index = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(10);
			System.out.println(ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0 && ar[i] != 0) {
				System.out.println("Chetnoe chislo: " + ar[i] + ";");
				count++;
				index = ar[i];
				System.out.println(index);

			}
		}
		System.out.println("Numbers New Array = " + count + ";");
		int[] newAr = new int[count];
		for (int i = 0; i < newAr.length; i++) {
			newAr[i] = inPutNum.nextInt();
			System.out.println(newAr[i] + ";");
		}
	}
}
