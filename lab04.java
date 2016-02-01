import java.util.Scanner;

public class lab04 {
	public static void main(String[]args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		boolean alive = true;
		int action;
		int opt1;
		int opt2;
		int opt3;
		int util1 = 0;
		int util2 = 0;
		int totalUtil = 0;
		
		//Get user's name
		String name;
		System.out.println("Please enter your name:");
		name = keyboard.nextLine();
		System.out.println("Welcome, " +name);
		
		//Ask user to choose an option
		do {
		System.out.println("Select your action:");
		System.out.println("(1). Buy people ice cream");
		System.out.println("(2). Steal ice cream from people");
		System.out.println("(3). Dream about people eating ice cream");
		System.out.println("(4). Die");
		action = keyboard.nextInt();
		switch (action){
		
		case 1:
		System.out.println("How many people did you buy ice cream for?");
		opt1 = keyboard.nextInt();
		util1 = (opt1 * 3);
		System.out.println("This action caused " +util1+ " utils of happiness.");
		break;
		
		case 2:
		System.out.println("How many people did you steal ice cream for?");
		opt2 = keyboard.nextInt();
		util2 = (opt2 * -5);
		System.out.println("This action caused " +util2+ " utils of happiness.");
		break;
		
		case 3:
		System.out.println("How many people did you dream about eating ice cream?");
		opt3 = keyboard.nextInt();
		System.out.println("This action caused 0 utils of happiness.");
		break;

		case 4:
			alive = false;
			totalUtil = (util1 + util2);
			System.out.println("You have died.");
			System.out.println("Your total number of utils is " +totalUtil);
			
			if (totalUtil > 0)
			{
				System.out.println("You have lived a morally good life.");
				System.exit(2);
			}
			else if (totalUtil == 0)
			{
				System.out.println("You have lived a morally neutral life.");
				System.exit(2);
			}
			else if (totalUtil < 0)
			{
				System.out.println("You have lived a morally evil life.");
				System.exit(2);
			}
		break;
		}
		}
		while (alive = true);
		}
		
		
		
		
		
		
		
		
	}