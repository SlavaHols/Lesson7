package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task01 {
	public static void main(String[] args) {
		int n = 10;
		int[] ar = new int[n];
		int k = 3;
		int suma = 0;
		int kratnoe = 0;
		Random randNums = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = randNums.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % k == 0 && ar[i] != 0) {
				kratnoe = ar[i];
				suma = suma + kratnoe;
				System.out.println("Nums kratno 3: " + kratnoe + ";");
			}
		}
		System.out.println("Summa of the array element = " + suma + ".");
	}
}
