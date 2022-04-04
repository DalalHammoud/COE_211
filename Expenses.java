import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.*;

public class ExpensesTracker {
	public static void main(String[] args) {

		try {
			// Create FileWriter & Scanner objects & y/n string
			FileWriter fw = new FileWriter(new File("expenses.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outToFile = new PrintWriter(bw);
			BufferedReader br = new BufferedReader(new FileReader("expenses.txt"));
			// Start gathering information inside the loop you will start
			Scanner scan = new Scanner(System.in);
			String userInput = "y", name, purchace, summary, line;
			double money;
			while (userInput.equalsIgnoreCase("y")) {
				System.out.println("Input your name: ");
				name = scan.nextLine();
				System.out.println("What did you purchase?");
				purchace = scan.nextLine();
				System.out.println("How much did you pay? (in USD)");
				money = scan.nextDouble();

				outToFile.print("" + name + " purchased " + purchace + " for " + money + " US Dollars.");
				bw.newLine();
				System.out.println("Would you like to log another purchase? (y/n)");
				scan.nextLine();
				userInput = scan.nextLine();

			}
			if (userInput.equalsIgnoreCase("n")) {
				System.out.println("Would you like to read a summary of your purchases? (y/n)");
				summary = scan.nextLine();
				outToFile.close();
				if (summary.equalsIgnoreCase("y")) {
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
				} else if (summary.equalsIgnoreCase("n")) {
					System.out.println("Get off of ZoodMall!");
				}
			}
			// Close ClassWriter & Scanner objects

			scan.close();
			br.close();
			// If you have already have a expenses.txt file, you need to delete it
			// before you compile your code again

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
