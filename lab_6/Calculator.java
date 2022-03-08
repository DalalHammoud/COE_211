import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    public Calculator() {
        Scanner scanCalc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanCalc.nextInt();
        scanCalc.nextLine();
        System.out.println("Enter the opertor: ");
        String operator = scanCalc.nextLine();
        System.out.print("Input the second number: ");
        int num2 = scanCalc.nextInt();
        
        switch (operator) {
        	case "+":
        		System.out.println(add(num1, num2));
        		break;
        	case "-":
        		System.out.println(subtract(num1, num2));
        		break;
        	case "*":
        		System.out.println(multiply(num1, num2));
        		break;
        	case "x":
        		System.out.println(multiply(num1, num2));
        		break;
        	case "/":
        		System.out.println(divide (num1, num2));
        		break;
        	
        }
        scanCalc.close();
    }

    public String add(int a, int b) {
        int result = a + b;
        operator = " + ";
       return a + operator + b + " = " + result;
    }

    public String subtract(int a, int b) {
        int result = a - b;
        operator = " - ";
        return a + operator + b + " = " + result;
    }

    public String multiply(int a, int b) {
        int result = a * b;
        operator = " x ";
        return a + operator + b + " = " + result;
    }

    public String divide(int a, int b) {
        int result = a/b;
        operator = "/";
        return a + operator + b + " = " + result;
    }
}
