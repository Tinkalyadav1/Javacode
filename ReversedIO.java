// Reveres a string using input

import java.util.Scanner;

public class ReversedIO{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();           //this line read a value 
        String rev="";
        for(int i = str.length()-1;i>=0;i--){    
            rev = rev + str.charAt(i);

        }
        System.out.println("revered:" +rev);
    }

}

