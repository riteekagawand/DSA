import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num +" is an Even Number");
        }
        else{
            System.out.println(num +" is an Odd Number");
        }
    }
    
}
