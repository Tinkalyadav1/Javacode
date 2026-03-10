// write a code to print a even and odd by using scanner

import java.util.Scanner;
public class EvenNumber {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
       if (n % 2== 0) {
        System.out.print(n + " is even");
       }else{
        System.out.print(n + " is odd");
       }
     
     sc.close();
    }

}
