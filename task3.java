import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите первок число: ");
        int num1 = iScanner.nextInt();
        System.out.println("Введите оператор: +, -, /, * ");
        char operator = iScanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        int num2 = iScanner.nextInt();
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
        }
        System.out.printf("%s %s %s = %s", num1, operator, num2, result);
        iScanner.close(); 
    }
}
