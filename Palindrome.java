import java.util.Scanner;
public class Palindrone{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        String reversed ="";
        for (int i = word.length()-1; i >=0;i--){
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)){
           System.out.println("its a Palindrome");
        }
            else{
            System.out.println("is not Palindrome");
            }
            sc.close();
           }
        }