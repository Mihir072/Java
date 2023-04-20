import java.util.Scanner;

public class Test{

    public static int Avarage(int a, int b, int c){
        Scanner sc = new Scanner(System.in);
       int sum = a+b+c;
       int Average = sum/3;
       return Average; 
    }

    public static boolean isEven(int n){
    
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static int SumOfInt(int n){
        int sumDigit = 0;
        while(n>0){
            int lastDigit = n%10;
           SumDigid += lastDigid;
            n = n/10;
        }
        return SumOfInt;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+ sumDigits(digits));
    }
    public static int sumDigits(int n){
        int sumOfDigits = 0;
        while(n>0){ 
            int lastDigit = n%10;
            sumOfDigits += lastDigit;
            n/=10;
        }
        return sumOfDigits;
       
    }
}