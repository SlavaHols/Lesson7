package lesson7.lt.lhu.lesson07;

public class Task19 {
	public static void main(String[] args) {
		int[] ar = new int[] { 2, 4, 7, 0, 6, 4, 5, 9, 4, 22, 4 };
		int count = 1;
		int temp = ar[0];
		int equalNum = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			temp = ar[i];
			for (int j = i + 1; j < ar.length - 1; j++) {
				if (ar[i] == ar[j]) {
					temp = ar[j];
					equalNum = temp;
					count++;
				}
			}
			System.out.println(equalNum);
			System.out.println("|||||||||||||||");
		}
		System.out.println("Number equals : = " + count);
		System.out.println(equalNum);
	} // все работает при условии что одинаковое число лишь одно,
		// но как написать алгоритм если одинаковых чисел в последовательности несколько
		// ?
}
