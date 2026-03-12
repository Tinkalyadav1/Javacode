public class FibonacciPrint{
    public static void main(String [] args){
        int n =20;
        int a=0,b=1;
        System.out.print("Fibonacci series:" +a+" "+b+" ");
        for(int i= 2;i< n ;i++){
            int c = a + b;
            System.out.println(c+ " ");
            a=b;
            b=c;
        }
    }
}