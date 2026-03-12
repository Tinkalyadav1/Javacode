import java.util.Scanner;

public class PrimeIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            for(int i = 2; i <= n/2; i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(n + " IS PRIME");
        } else {
            System.out.println(n + " NOT PRIME");
        }
    }
}