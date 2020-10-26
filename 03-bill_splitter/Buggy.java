import java.util.*;

public class Buggy{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Bill-Splitter");
		System.out.print("Enter the total, pre-tax: ");
    double total = input.nextDouble();

		System.out.print("How much percent tax? ");
		double tax = input.nextDouble()/100;

		System.out.print("How much percent tip to add? ");
		double tip = input.nextDouble()/100;

		System.out.print("How many people? ");
		int numPeople = input.nextInt();

		double tipCash = total * tip;
		total *= (tax+1);
		total += tipCash;
		double perPerson = total/numPeople;
		System.out.println("Each person must pay $" + perPerson);

	}//end main method
}//end class
