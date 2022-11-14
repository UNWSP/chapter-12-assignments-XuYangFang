package ch12home;
import java.util.*;
public class DistanceFromAverageWithExceptionHandling {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] number;
		double entry = 0;
		int size = 0;
		double total = 0;
		double average = 0;
		final int QUIT = 99999;
		boolean Negative = false;
		boolean Double = true;
		boolean Value = false;
		int x = 0, y;

		try{
			System.out.print("Enter a value for the array size: ");
			size = input.nextInt();
		}
		
		catch(Exception e){
			System.out.println("Invalid value");
			Double = false;
			input.nextLine();
		}

		if(size < 0){
			System.out.print("Negative value. Automatically value of size 5");
		
		while(!Negative){
			size = 5;
			input.nextLine();
			}
		}

		if(Double){
			number = new double[size];
			
		while(!Value){
			try{
				System.out.print("Enter a value or enter " + QUIT + " to quit >> ");
				entry = input.nextDouble();
				Value = true;
					}
			
		catch(Exception e){
			Value = false;
			input.nextLine();
		}
			}
		
		while(entry != QUIT && x < number.length){
			number[x] = entry;
			++x;
		
		if(x < number.length){
			try{
				System.out.print("Enter next value or enter " + QUIT + " to quit >> ");
				entry = input.nextDouble();
					}
			
		catch(Exception e){
			--x;
			input.nextLine();
				}
			}
		}
		
		if(x == 0) {
			System.out.println("Error, size is 0! ");}
		
		else{
			for(int a = 0; a < number.length; ++a)
				total += number[a];
				average = total / x;
				System.out.println("You entered " + x + " numbers and average is " + average);
				
		for(y = 0; y < x; ++y) {
			System.out.println(number[y] + " is " + (average - number[y]) + " away from the average");}
			}
		
		}

	}

}



