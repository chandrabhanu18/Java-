import java.util.*;
class Day3 {
    public void print1ton(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        print1ton(n-1);
    }
    public void printNToOne(int n){
        if(n==0){
            return ;
        }
        printNToOne(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Day3 d=new Day3();
        int n=5;
        d.print1ton(n);
        d.printNToOne(n);
    }
}
