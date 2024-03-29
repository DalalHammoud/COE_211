import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args) {
		String userInput = "y";
		Scanner scan = new Scanner(System.in);
		while (userInput.equalsIgnoreCase("y")) {
			System.out.println("Which service would you like to use?\n[1]: Basic week visualizer\r\n"
					+ "[2]: Advanced week visualizer\r\n" + "[3]: Basic calculator\r\n" + "[4]: Employee repertoire\r\n"
					+ "");
			int service = scan.nextInt();
			while (service != 1 && service != 2 && service != 3 && service != 4) {
				System.out.println("Please make sure you pick a number between 1 and 4");
				System.out.println("Which service would you like to use?\n[1]: Basic week visualizer\r\n"
						+ "[2]: Advanced week visualizer\r\n" + "[3]: Basic calculator\r\n"
						+ "[4]: Employee repertoire\r\n" + "");
				service = scan.nextInt();
			}
			switch (service) {
			case 1:
				BasicWeek BW = new BasicWeek();
				BW.printDays();
				break;
			case 2:
				AdvancedWeek AW = new AdvancedWeek();
				AW.printDays();
				break;
			case 3:
				Calculator C = new Calculator();
				break;
			case 4:
				Employee E = new Employee();
				System.out.println(E.toString());
				break;
			}
			
			System.out.println("Would you like to perform another operation? (y/n)");
			scan.nextLine();
			userInput = scan.next();
		}
		if (userInput.equalsIgnoreCase("n")) {
			System.out.println("Have a good day!!");
		}
		scan.close();
	}
}
