import java.util.Scanner;

public class Average {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float Average = (a+b+c)/3;

        System.out.print(Average);


    }
}