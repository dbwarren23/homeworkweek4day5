import java.util.Scanner;
import java.util.ArrayList;

public class ControlFlowHomework {

	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
		
		Scanner name = new Scanner(System.in);
		System.out.println("Please enter your name");
		String yourName = name.nextLine();
		
		Scanner confirm = new Scanner(System.in);
		System.out.println("Hello " + yourName + " Do you wish to continue?"
				+ " Enter y for Yes or n for No" );
		String confirmAnswer = confirm.nextLine();
			
		Scanner redCar = new Scanner(System.in);
		System.out.println("Do you have a red car? (Yes or No)");
		String redCarStatus = redCar.nextLine();
			
		Scanner petName = new Scanner(System.in);
		System.out.println("Please enter your pet's name");
		String petsName = petName.nextLine();
			
		Scanner petAge = new Scanner(System.in);
		System.out.println("Please enter your pet's age");
		int yourPetsAge = petAge.nextInt();
			
		Scanner luckyNumber = new Scanner(System.in);
		System.out.println("Please enter your lucky number");
		int yourLuckyNumber = luckyNumber.nextInt();
			
		Scanner carModelYear = new Scanner(System.in);
		System.out.println("Please enter your car's model year"
				+ "(last two digits only)");
		int yourModelYear = carModelYear.nextInt();
			
		Scanner favoriteActor = new Scanner(System.in);
		System.out.println("Please enter the name of your favorite actor");
		String yourFavoriteActor = favoriteActor.nextLine();
			
		Scanner randomNumber = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 50");
		int yourRandomNumber = randomNumber.nextInt();
			
		ArrayList<Object> luckyNumbers = new ArrayList<Object>();
		luckyNumbers.add(redCarStatus);
		luckyNumbers.add(petsName);
		luckyNumbers.add(yourPetsAge);
		luckyNumbers.add(yourModelYear);
		luckyNumbers.add(yourFavoriteActor);
		luckyNumbers.add(yourLuckyNumber*yourRandomNumber);
			
		System.out.println(luckyNumbers);
		
			}
				
	}
			


