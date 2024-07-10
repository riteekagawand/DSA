import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Num 2");
        int num2 = sc.nextInt();
        System.out.println("\n1: Additon");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("\nChoose one");
        int opp = sc.nextInt();

        switch (opp) {
            case 1:
                int add = num1 + num2;
                System.out.println("\nAddition is " + add);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println("\nSubstraction is " + sub);
                break;
            case 3:
                int mul = num1 * num2;
                System.out.println("\nMultiplication is " + mul);
                break;
            case 4:
                int div = num1 / num2;
                System.out.println("\nDivision is " + div);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
