import java.util.Scanner;

class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digit = n % 10;

        System.out.println("Last Digit = " + digit);
    }
}