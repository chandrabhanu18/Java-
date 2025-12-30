// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public int reverse(int a){
        int rev=0;
        while(a>0){
            int r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        return rev;
    }
    public int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public int countOfDigits(int number){
        int ct=0;
        while (number>0){
            ct++;
            number/=10;
        }
        return ct;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int digit=sc.nextInt();
        Main m=new Main();
        int result=m.reverse(digit);
        System.out.println("The reverse of "+digit +" is "+result);
        int NoOfDigits=m.countOfDigits(digit);
        System.out.println("Total number of digits in "+digit+" is "+NoOfDigits);
        int f=m.factorial(digit);
        System.out.println("The factorial of "+digit+" is "+f);
    }
}