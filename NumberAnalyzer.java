
package applications;
import java.util.Scanner;

public class NumberAnalyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you insert? ");
		int many = sc.nextInt();
		System.out.println();
		int[] numbers = new int[many];
		
		for(int i=0; i<numbers.length;i++) {
			System.out.print("Insert " + (i+1) + "º number: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.print("\nNumbers entered: ");
		printArray(numbers);
		
		double sum = calculateAverage(numbers);
		System.out.printf("Average: %.2f%n", sum);
		
		int max = findMax(numbers);
		System.out.print("Highest number: "+ max + "\n");
		
		int min = findMin(numbers);
		System.out.print("Lowest number: " + min);
		
		sc.close();
	}
	public static void printArray(int[] numbers) {
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	public static double calculateAverage(int[] numbers) {
		double sum = 0.0;
		for (int i=0; i<numbers.length;i++) {
			sum += numbers[i];
		}
		return sum / numbers.length;
	}
	public static int findMax(int[] numbers) {
		int max = numbers[0];
		for (int i=1; i<numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}
	public static int findMin(int[] numbers) {
		int min = numbers[0];
		for (int i=1; i<numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
}
