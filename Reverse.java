//PRINT A REVERSED STRING 
public class Reverse{   
    public static void main(String[]args){
        String str ="HELLO";
        String  rev = "";

        for(int i = str.length()-1; i>=0; i--){      // SYNTAX FOR STRING REVERSED 
        rev = rev+str.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }
}