import java.util.Arrays;
import java.util.Scanner;

public class sort {
	public static void main (String arg[]) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("input 5 psc integer numbers, pressing enter after each number");
			int array[ ] = new int[5];
			for(int i=0;i<array.length;i++)
			{
			array[i]=input.nextInt();
			}
			int temp;
	        for (int i = 1; i < array.length; i++) {
	            for (int j = i; j > 0; j--) {
	                if (array[j] > array [j-1]) {
	                    temp = array[j];
	                    array[j] = array[j-1];
	                    array[j-1] = temp;
	                }
	            }
	        }
	          System.out.println(Arrays.toString(array));
	}
}



