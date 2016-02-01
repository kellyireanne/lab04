import java.util.Scanner;

public class lab04b {
	public static void main(String[]args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		int level;
		
		System.out.println("The following list is Maslow's hierarchy of needs");
		System.out.println("Please select which level you feel you are currently at.");
		System.out.println();
		System.out.println("(5). Self-Actualization (achieving your total potential)");
		System.out.println("(4). Esteem (respect from others, self-respect)");
		System.out.println("(3). Love and Belonging (friendship and family)");
		System.out.println("(2). Safety (financial and personal security)");
		System.out.println("(1). Physiological (oxygen, food, water)");
		level = keyboard.nextInt();
		System.out.println("The needs you have met are:");
		
		switch(level)
		{
		case 5:
		System.out.println("Self-Actualization");
		
		case 4:
		System.out.println("Esteem");
		
		case 3:
		System.out.println("Love and Belonging");
		
		case 2:
		System.out.println("Safety");
		
		case 1:
		System.out.println("Physiological");
		}
}
}