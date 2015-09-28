package Subversion;

import java.util.Scanner;
import java.util.Arrays;

public class Subversion {
	public static void main (String[]args){
		Scanner lector = new Scanner(System.in);
		
		int[] array=new int[10];
		
		for(int i=0;i<array.length;i++){
			System.out.println("Entra un numero entero: ");
			array[i]=lector.nextInt();
			lector.nextLine();
		}
		Arrays.sort(array);
		System.out.println(array[0]+"array[]array.length-1);
	}
}