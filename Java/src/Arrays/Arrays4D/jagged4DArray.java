package Arrays.Arrays4D;
import java.util.*;

public class jagged4DArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1D length of 4D array: ");
		// Creating 4D array while taking 1D length as input 
		int[][][][] arr = new int[sc.nextInt()][][][];
		
		// Taking 2D lengths and creating arrays
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the 2D length for 1D index " + i + ": ");
			arr[i] = new int[sc.nextInt()][][];
		} 
		
		// Taking 3D lengths and creating arrays
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the 3D length for [" + i + "][" + j + "]: ");
				arr[i][j] = new int[sc.nextInt()][];
			}
		}
		
		// Taking 4D lengths and creating arrays
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the 4D length for [" + i + "][" + j + "][" + k + "]: ");
					arr[i][j][k] = new int[sc.nextInt()];
				}
			}
		} 
		
		// Taking elements input
		System.out.println("\n--- Enter elements for the 4D array ---");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					for(int l = 0; l < arr[i][j][k].length; l++) {
						System.out.print("Element at [" + i + "][" + j + "][" + k + "][" + l + "]: ");
						arr[i][j][k][l] = sc.nextInt();
					}
				}
			}
		}
		
		// Printing elements
		System.out.println("\n--- The elements in the 4D jagged array are ---");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					for(int l = 0; l < arr[i][j][k].length; l++) {
						System.out.print(arr[i][j][k][l] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}
}